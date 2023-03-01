package com.example.m8uf1t10helenamadrenys;

public class MovieClass {

    private String title;
    private String tags;
    private Boolean reserved;
    private int imageId;

    public MovieClass(String title, String tags, Boolean reserved, int imageId){
        this.title = title;
        this.tags = tags;
        this.reserved = reserved;
        this.imageId = imageId;
    }

    public String getTitle() {return title; }
    public void setTitle(String title) {this.title = title;}

    public String getTags() {return tags; }
    public void setTags(String tags) {this.tags = tags;}

    public Boolean getTReserved() {return reserved; }
    public void setReserved(Boolean reserved) {this.reserved = reserved;}

    public int getImageId() {return imageId; }
    public void setImageId(int imageId) {this.imageId = imageId;}
}
