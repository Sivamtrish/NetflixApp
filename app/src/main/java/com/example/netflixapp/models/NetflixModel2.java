package com.example.netflixapp.models;

public class NetflixModel2 {
    String imgSource;
    String imgUrl2;

    public NetflixModel2( String imgSource, String imgUrl2) {
        this.imgSource = imgSource;
        this.imgUrl2 = imgUrl2;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }
}
