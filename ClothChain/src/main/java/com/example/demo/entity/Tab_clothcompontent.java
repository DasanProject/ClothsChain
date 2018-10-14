package com.example.demo.entity;

public class Tab_clothcompontent {
    private Integer compontentid;

    private Integer styleid;

    private String compontentname;

    private String describle;

    public Integer getCompontentid() {
        return compontentid;
    }

    public void setCompontentid(Integer compontentid) {
        this.compontentid = compontentid;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getCompontentname() {
        return compontentname;
    }

    public void setCompontentname(String compontentname) {
        this.compontentname = compontentname == null ? null : compontentname.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }
}