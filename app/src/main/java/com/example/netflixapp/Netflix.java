package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.netflixapp.adapter.GithubAdapter;
import com.example.netflixapp.adapter.NetflixAdapter;
import com.example.netflixapp.interfaces.NetworkService;
import com.example.netflixapp.models.FamousCitiesResponse;
import com.example.netflixapp.models.GitHupResponse;
import com.example.netflixapp.models.LoginRequest;
import com.example.netflixapp.models.LoginResponse;
import com.example.netflixapp.models.NetflixModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Netflix extends AppCompatActivity {
    RecyclerView firstNetflixRecyclerView;
    RecyclerView secondNetflixRecyclerView;
    private long userid;
    NetworkService service = Application.getRetrofit().create(NetworkService.class);
    NetworkService jsonService = Application.getRetrofit2().create(NetworkService.class);

dfgdfgdfg
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.netflix);
        firstNetflixRecyclerView = findViewById(R.id.netflixRecyclerView);
//        secondNetflixRecyclerView = findViewById(R.id.secondRecyclerView);

        firstNetflixRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        firstNetflixRecyclerView.setHasFixedSize(true);

//        secondNetflixRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//        secondNetflixRecyclerView.setHasFixedSize(true);


        service.listRepos(userid).enqueue(new Callback<List<GitHupResponse>>() {
            @Override
            public void onResponse(Call<List<GitHupResponse>> call, Response<List<GitHupResponse>> response) {
//                for (int i = 0; i < response.body().size(); i++) {
//                    System.out.println("response:" + response.body().get(i).getReposUrl());
//
//                }
                GithubAdapter githubAdapter = new GithubAdapter(Netflix.this, response.body());
                firstNetflixRecyclerView.setAdapter(githubAdapter);
            }

            @Override
            public void onFailure(Call<List<GitHupResponse>> call, Throwable t) {

            }

        });

        jsonService.listOfFamousMovies().enqueue(new Callback<List<FamousCitiesResponse>>() {
            @Override
            public void onResponse(Call<List<FamousCitiesResponse>> call, Response<List<FamousCitiesResponse>> response) {
                List<FamousCitiesResponse> oneCityRecord = response.body();
                NetflixAdapter netflixAdapter = new NetflixAdapter(Netflix.this, oneCityRecord);
                firstNetflixRecyclerView.setAdapter(netflixAdapter);
            }

            @Override
            public void onFailure(Call<List<FamousCitiesResponse>> call, Throwable t) {
                Toast.makeText(Netflix.this, "error" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }

}


//        List<NetflixModel> netflixModelList = new ArrayList<>();
//        NetflixModel firstRecyclerView = new NetflixModel("Cinque Terre", "The Coastline,the five villages in italy", "http://bit.ly/CBImageCinque");
//        NetflixModel firstRecyclerView1 = new NetflixModel("Paris", "Paris is the capital city of France", "http://bit.ly/CBImageParis");
//        NetflixModel firstRecyclerView2 = new NetflixModel("Rio de Janeiro", "Rio has been one of Brazil's most popular destinations", "http://bit.ly/CBImageRio");
//        NetflixModel firstRecyclerView3 = new NetflixModel("Rio de Janeiro", "Rio has been one of Brazil's most popular destinations", "http://bit.ly/CBImageRio");
//        NetflixModel firstRecyclerView4 = new NetflixModel("Rio de Janeiro", "Rio has been one of Brazil's most popular destinations", "http://bit.ly/CBImageRio");
//
//        netflixModelList.add(firstRecyclerView);
//        netflixModelList.add(firstRecyclerView1);
//        netflixModelList.add(firstRecyclerView2);
//        netflixModelList.add(firstRecyclerView3);
//        netflixModelList.add(firstRecyclerView4);
//
//
//        NetflixAdapter netflixAdapter = new NetflixAdapter(this, netflixModelList);
//
//        netflixAdapter.notifyDataSetChanged();
//        firstNetflixRecyclerView.setAdapter(netflixAdapter);
//
//        List<NetflixModel2> netflixModelList2 = new ArrayList<>();
//        NetflixModel2 secondRecyclerView = new NetflixModel2("","http://bit.ly/CBImageParis");
//        NetflixModel2 secondRecyclerView1 = new NetflixModel2("", "http://bit.ly/CBImageParis");
//        NetflixModel2 secondRecyclerView2 = new NetflixModel2("", "http://bit.ly/CBImageParis");
//        NetflixModel2 secondRecyclerView3 = new NetflixModel2("", "http://bit.ly/CBImageParis");
//
//        netflixModelList2.add(secondRecyclerView);
//        netflixModelList2.add(secondRecyclerView1);
//        netflixModelList2.add(secondRecyclerView2);
//        netflixModelList2.add(secondRecyclerView3);
//
//        NetflixAdapter2 netflixAdapter2 = new NetflixAdapter2(this, netflixModelList2);
//
//        netflixAdapter2.notifyDataSetChanged();
//        secondNetflixRecyclerView.setAdapter(netflixAdapter2);
//    }
//}