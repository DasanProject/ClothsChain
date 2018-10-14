package com.example.demo.entity;

public class Tab_size {
    private Integer sizeid;

    private String sizename;

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public String getSizename() {
        return sizename;
    }

    public void setSizename(String sizename) {
        this.sizename = sizename == null ? null : sizename.trim();
    }
}