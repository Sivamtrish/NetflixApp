package com.example.netflixapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.netflixapp.R;
import com.example.netflixapp.models.NetflixModel;
import com.example.netflixapp.models.NetflixModel2;

import java.util.List;


public class NetflixAdapter2 extends RecyclerView.Adapter<NetflixAdapter2.ViewHolder> {
    private Context context;
    private List<NetflixModel2> netflixModel2List;

    public NetflixAdapter2(Context context, List<NetflixModel2> netflixModel2List) {
        this.context = context;
        this.netflixModel2List = netflixModel2List;
    }

    @NonNull
    @Override
    public NetflixAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.netflix_item_2, parent, false);
        NetflixAdapter2.ViewHolder viewHolder = new NetflixAdapter2.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NetflixAdapter2.ViewHolder holder, int position) {
        NetflixModel2 netflixModel2 = netflixModel2List.get(position);
        Glide.with(context).load(netflixModel2.getImgUrl2()).into(holder.fImgSource);
    }

    @Override
    public int getItemCount() {
         return netflixModel2List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView fImgSource;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fImgSource = (ImageView) itemView.findViewById(R.id.imgSource);
        }
    }
}