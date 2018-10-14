package com.example.demo.entity;

public class Tab_badproblem {
    private Integer typeinid;

    private Integer styleid;

    private String location;

    private String badname;

    private String defectlevels;

    public Integer getTypeinid() {
        return typeinid;
    }

    public void setTypeinid(Integer typeinid) {
        this.typeinid = typeinid;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getBadname() {
        return badname;
    }

    public void setBadname(String badname) {
        this.badname = badname == null ? null : badname.trim();
    }

    public String getDefectlevels() {
        return defectlevels;
    }

    public void setDefectlevels(String defectlevels) {
        this.defectlevels = defectlevels == null ? null : defectlevels.trim();
    }
}