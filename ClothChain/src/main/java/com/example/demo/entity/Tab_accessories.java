package com.example.demo.entity;

public class Tab_accessories {
    private Integer accessoriesid;

    private String accessoriesnum;

    private String accessoriesname;

    private String describle;

    private Integer type;

    public Integer getAccessoriesid() {
        return accessoriesid;
    }

    public void setAccessoriesid(Integer accessoriesid) {
        this.accessoriesid = accessoriesid;
    }

    public String getAccessoriesnum() {
        return accessoriesnum;
    }

    public void setAccessoriesnum(String accessoriesnum) {
        this.accessoriesnum = accessoriesnum == null ? null : accessoriesnum.trim();
    }

    public String getAccessoriesname() {
        return accessoriesname;
    }

    public void setAccessoriesname(String accessoriesname) {
        this.accessoriesname = accessoriesname == null ? null : accessoriesname.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}