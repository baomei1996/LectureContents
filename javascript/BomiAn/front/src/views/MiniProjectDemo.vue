<template>
  <div class="home">
    <!-- <v-card
      class="mx-auto"
      max-width="750">
      <v-card-text>
        <div>balance</div>
        <p class="text-h4 text--primary">
          Q. 토맛 토마토, 토마토맛 토
        </p>
        <p mb-0>bomi</p>
        <v-divider></v-divider>
        <div class="text-center mt-2 d-inline-flex pa-2">
          <v-btn class="ma-2" outlined color="primary">
              토맛 토마토
          </v-btn>
           <p class="mt-auto" color="black">
            VS
          </p>
          <v-btn class="ma-2" outlined color="red"> 
              토맛토맛 토마토 
          </v-btn>
        </div>
      </v-card-text>
      <v-card-actions>
        <v-btn text color="deep-purple accent-4">
          Go To Vote
        </v-btn>
      </v-card-actions>
       <div class="text-right mt-1 d-flex pa-1">
         <v-btn
        class="ma-2" text icon disabled color="blue lighten-2">
        <v-icon>mdi-account-group</v-icon>
      </v-btn>
      <p class="mt-auto">3 people participated</p>
      </div>
    </v-card> -->
  <v-row justify="center">
    <v-dialog v-model="dialog" persistent max-width="600px">
      <v-card>
        <v-card-title>
          <span class="text-h5">Leave your comment!</span>
        </v-card-title>
        <v-card-text>
          <v-container>
            <v-row>
              <v-col cols="12">
                <v-text-field label="comment" required
                ></v-text-field>
              </v-col>
            </v-row>
          </v-container>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="blue darken-1" text @click="dialog = false">
            Close
          </v-btn>
          <v-btn color="blue darken-1" text @click="dialog = false">
            Save
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-row>
  <div>
  <v-container> 
    <v-simple-table dense>
    <template v-slot:default>
      <thead>
        <tr>
          <th class="text-left">
            Nickname
          </th>
          <th class="text-left">
            Comments
          </th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="comment in comments" :key="comment.c_no">
          <td>{{ comment.user }}</td>
          <td>{{ comment.comment }}</td>
        </tr>
      </tbody>
    </template>
  </v-simple-table>
  </v-container>
  </div>
  </div>
</template>

<script>

  export default {
    name: 'MiniProjectDemo',
    components: {

    },
    created() {
    this.$http.get("/api/users").then((response) => {
      this.users = response.data;
    });
  },
  data() {
    return {
      dialog: false
    }
  },
  }
</script>
