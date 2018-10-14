package com.example.demo.entity;

public class Tab_color {
    private Integer colorid;

    private String colorno;

    private String colorname;

    private String colorstr;

    private String url;

    private Integer state;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorno() {
        return colorno;
    }

    public void setColorno(String colorno) {
        this.colorno = colorno == null ? null : colorno.trim();
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }

    public String getColorstr() {
        return colorstr;
    }

    public void setColorstr(String colorstr) {
        this.colorstr = colorstr == null ? null : colorstr.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}