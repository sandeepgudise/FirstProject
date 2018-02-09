package com.example.sandeep.firstproject;

import android.widget.EditText;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by sandeep on 09-02-2018.
 */

public interface RetroInterface {

    @POST("insert.php")
    @FormUrlEncoded
    Call<ResponseBody> login(@Field("name") EditText name, @Field("phone") EditText phone, @Field("password") EditText password);

}
