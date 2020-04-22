package com.ade.testkedua.api;

import com.ade.testkedua.model.LoginResponse;
import com.ade.testkedua.model.ProductResponse;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @FormUrlEncoded
    @POST("member-api/login")
    Call<LoginResponse> userLogin(
            @Field("ClientID") String clientId,
            @Field("Email") String email,
            @Field("Password") String password
    );

    @GET("product-api/search/?ClientID=d067c583cba8b583a185000a980e3627")
    Call<ProductResponse> search(@Query("AccessToken") String AccessToken);


}
