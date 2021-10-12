package com.example.springTest.controller.vue.file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.List;

@Slf4j
@RequestMapping(value = "/file")
@RestController
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class VueFileController {

    @PostMapping("/uploadImg")
    @ResponseBody
    public String requestUploadFile(@RequestParam("fileList") List<MultipartFile> fileList) {
        log.info("requestUploadFile(): Processing!!");
        try {
            for (MultipartFile multipartFile : fileList) {
                FileOutputStream writer = new FileOutputStream("./images/" + multipartFile.getOriginalFilename());
                writer.write(multipartFile.getBytes());
                writer.close();
            }
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        return "Upload Success!!";
    }
}
