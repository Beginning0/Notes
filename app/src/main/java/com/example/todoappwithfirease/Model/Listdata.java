package com.example.todoappwithfirease.Model;

public class Listdata {

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String id;
    public String title;
    public String desc;

    public Listdata(String id,String title, String desc) {
        this.id=id;
        this.title = title;
        this.desc = desc;

    }

}