package com.example.shiboo.fajri_1202140198_modul6;

public class ImageUpload {

    public String imageName;

    public String imageURL;

    public ImageUpload() {

    }

    public ImageUpload(String name, String url) {

        this.imageName = name;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

}
