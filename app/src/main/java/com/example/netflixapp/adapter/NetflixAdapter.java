package com.example.netflixapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.netflixapp.R;
import com.example.netflixapp.models.FamousCitiesResponse;
import com.example.netflixapp.models.NetflixModel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class NetflixAdapter extends RecyclerView.Adapter<NetflixAdapter.ViewHolder> {
    private Context context;
    private List<FamousCitiesResponse> famousResponse;

    //This is the constructor for the NetflixAdapter class
    public NetflixAdapter(Context context, List<FamousCitiesResponse> famousResponse) {
        this.context = context;
        this.famousResponse = famousResponse;
    }

    @NonNull
    @Override
    public NetflixAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.netflix_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NetflixAdapter.ViewHolder holder, int position) {
        FamousCitiesResponse famousCitiesResponse = famousResponse.get(position);

        Glide.with(context).load(famousCitiesResponse.getUrl()).into(holder.fImageSource);
    }

    @Override
    public int getItemCount() {
        return famousResponse.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView fImageSource;
        public TextView fImageTitle;
        public TextView fImageUrl;

        public ViewHolder(View itemView) {
            super(itemView);

            fImageSource = (ImageView) itemView.findViewById(R.id.imageSource);
//            fImageTitle = (TextView) itemView.findViewById(R.id.imageTitle);
//            fImageUrl = (TextView) itemView.findViewById(R.id.imageUrl);


        }
    }
}
