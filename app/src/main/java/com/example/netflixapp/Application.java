package com.example.netflixapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Application extends android.app.Application {

    public static Retrofit retrofit,retrofit2;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit2 = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }

    public static Retrofit getRetrofit2() {
        return retrofit2;
    }
}
