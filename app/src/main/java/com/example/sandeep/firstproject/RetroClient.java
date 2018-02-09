package com.example.sandeep.firstproject;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by sandeep on 09-02-2018.
 */

public class RetroClient {

    private static final String BASE_URL = "http://139.59.34.10/RajaRatha/";
    private static OkHttpClient httpClient = new OkHttpClient.Builder().retryOnConnectionFailure(false).build(); //to stop okhttp from retrying

    //static Gson gson = new GsonBuilder().setLenient().create();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL);
    //gson converter converts "null" or "NULL" string from json into null object in java and show success
    //but if json response is null object then it dismiss that data and show IOException error
    //if json response is not in expected structure then shows conversion error
    //.addConverterFactory(GsonConverterFactory.create(gson));
    //Creating retrofit instance
    private static Retrofit retrofit =
            builder.client(httpClient).build();



    //will give RetroInterface instance to access its api methods
    public static RetroInterface getRetroInterface() {
        return retrofit.create(RetroInterface.class);
    }
}
