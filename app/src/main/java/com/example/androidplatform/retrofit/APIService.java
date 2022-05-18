package com.example.androidplatform.retrofit;

import com.example.androidplatform.resModels.CodeModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    @POST("/.netlify/functions/enforceCode")
    Call<CodeModel> codeData(@Body CodeModel model);
}
