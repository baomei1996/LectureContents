package com.example.springTest.service.hybrid;


import com.example.springTest.controller.hybrid.request.RequestHybridOrder;

public interface HybridOrderService {
    public Boolean registerOrder(RequestHybridOrder order) throws Exception;
    public void notice(RequestHybridOrder order) throws Exception;
}