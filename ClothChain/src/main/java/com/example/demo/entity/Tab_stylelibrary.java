package com.example.demo.entity;

public class Tab_stylelibrary {
    private Integer styleid;

    private String stylenum;

    private String stylename;

    private String describle;

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getStylenum() {
        return stylenum;
    }

    public void setStylenum(String stylenum) {
        this.stylenum = stylenum == null ? null : stylenum.trim();
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename == null ? null : stylename.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }
}