package com.example.netflixapp.interfaces;

import com.example.netflixapp.models.FamousCitiesResponse;
import com.example.netflixapp.models.GitHupResponse;
import com.example.netflixapp.models.LoginRequest;
import com.example.netflixapp.models.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NetworkService {
    @GET("users/{userId}")
    Call<List<GitHupResponse>> listRepos(@Path("userId") long userId);

    @GET("teachers")
    Call<List<GitHupResponse>> listTeachers();

    @GET("admin")
    Call<List<GitHupResponse>> listAdmin();

    @POST("users")
    Call<LoginResponse> loginUserWithdetails(@Body LoginRequest loginRequest);


    @GET("photos")
    Call<List<FamousCitiesResponse>> listOfFamousMovies();

}
