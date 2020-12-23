package com.example.android1lesson71;

public class Destination {

    private String title;
    private String subTitle;
    private int imageRecourcesId;

    public Destination(String title, String subTitle, int imageRecourcesId) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageRecourcesId = imageRecourcesId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }


    public int getImageRecourcesId() {
        return imageRecourcesId;
    }

    public void setImageRecourcesID(int imageRecourcesId) {
        this.imageRecourcesId = imageRecourcesId;
    }
}
