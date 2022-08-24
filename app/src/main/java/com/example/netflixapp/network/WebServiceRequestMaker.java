package com.example.netflixapp.network;

import com.example.netflixapp.Application;
import com.example.netflixapp.Netflix;
import com.example.netflixapp.adapter.GithubAdapter;
import com.example.netflixapp.interfaces.NetworkService;
import com.example.netflixapp.models.GitHupResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WebServiceRequestMaker {

    NetworkService service = Application.getRetrofit().create(NetworkService.class);

//    public void getAllUsers() {
//        service.listRepos().enqueue(new Callback<List<GitHupResponse>>() {
//            @Override
//            public void onResponse(Call<List<GitHupResponse>> call, Response<List<GitHupResponse>> response) {
//
//            }
//
//
//            @Override
//            public void onFailure(Call<List<GitHupResponse>> call, Throwable t) {
//
//            }
//
//        });
//    }

    public void loginUser(String username, String password){
        //todo
    }
}
