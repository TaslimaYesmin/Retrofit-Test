package com.example.retrofitelevenfebruary;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {
    @GET("/posts")
    Call<List<Post>>getPosts();
}
