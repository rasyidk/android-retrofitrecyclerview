package com.example.retrofitcobapagination;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RequestInterface {

    @GET("/coba_laporkan.php")
    Call<JSONResponse> getJSON();


}
