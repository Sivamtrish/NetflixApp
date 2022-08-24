package com.example.netflixapp.models;

public class NetflixModel {

    String imageSource;
    String imageTitle;
    String imageUrl;

    public NetflixModel(String imageSource, String imageTitle, String imageUrl) {
        this.imageSource = imageSource;
        this.imageTitle = imageTitle;
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "com.example.netflixapp.models.NetflixModel{" +
                "imageSource='" + imageSource + '\'' +
                ", imageTitle='" + imageTitle + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
