package com.hussain.payonclick;

import com.hussain.payonclick.modelclasses.LoginRequest;
import com.hussain.payonclick.modelclasses.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService
{

    @Headers("Content-Type: application/json")
    @POST("Vr1.0/74536/DJKIJF09320923JSDFOJDFLMSDS/KVLKMS09232309283KJSDJLWLEEJ203/api/UserLogin")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);
}
