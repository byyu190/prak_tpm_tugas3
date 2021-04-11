package com.examples.Tugas3;

public class LibModel {
    private String image,name, take, detail;

    public LibModel(String image, String name, String take, String detail) {
        this.image   = image;
        this.name    = name;
        this.take    = take;
        this.detail  = detail;
    }

    public LibModel() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTake() {
        return take;
    }

    public void setTake(String take) {
        this.take = take;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}