package com.example.netflixapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.netflixapp.R;
import com.example.netflixapp.models.GitHupResponse;
import com.example.netflixapp.models.NetflixModel;

import java.util.List;


public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.ViewHolder> {
    private Context context;
    private List<GitHupResponse> gitHupResponseList;

    public GithubAdapter(Context context, List<GitHupResponse> list) {
        this.context = context;
        this.gitHupResponseList = list;
    }

    @NonNull
    @Override
    public GithubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.github_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GithubAdapter.ViewHolder holder, int position) {
        GitHupResponse gitHupResponseItem = gitHupResponseList.get(position);
        System.out.println("avatar url "+gitHupResponseItem.getReposUrl());

        Glide.with(context).load(gitHupResponseItem.getAvatarUrl()).into(holder.fGithubImage);
        holder.fLoginName.setText(gitHupResponseItem.getLogin());
        holder.furl.setText(gitHupResponseItem.getUrl());

    }

    @Override
    public int getItemCount() {
        return gitHupResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView fGithubImage;
        public TextView fLoginName;
        public TextView furl;

        public ViewHolder(View itemView) {
            super(itemView);

            fGithubImage = (ImageView) itemView.findViewById(R.id.githupAvatarimage);
            fLoginName = (TextView) itemView.findViewById(R.id.githublogin);
            furl = (TextView) itemView.findViewById(R.id.githuburl);

            //            fImageUrl = (TextView) itemView.findViewById(R.id.imageUrl);


        }
    }
}
