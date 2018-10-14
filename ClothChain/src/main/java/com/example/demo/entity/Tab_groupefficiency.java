package com.example.demo.entity;



public class Tab_groupefficiency {
    private Integer setid;

    private Integer styleid;

    private String groupcoding;

    private String groupname;

    private String stylenumber;

    private Double teamefficiency;

    private Integer standardnum;

    private Double learningcoefficient;

    private Double ciency;

    public Integer getSetid() {
        return setid;
    }

    public void setSetid(Integer setid) {
        this.setid = setid;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getGroupcoding() {
        return groupcoding;
    }

    public void setGroupcoding(String groupcoding) {
        this.groupcoding = groupcoding == null ? null : groupcoding.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getStylenumber() {
        return stylenumber;
    }

    public void setStylenumber(String stylenumber) {
        this.stylenumber = stylenumber == null ? null : stylenumber.trim();
    }

    public Double getTeamefficiency() {
        return teamefficiency;
    }

    public void setTeamefficiency(Double teamefficiency) {
        this.teamefficiency = teamefficiency;
    }

    public Integer getStandardnum() {
        return standardnum;
    }

    public void setStandardnum(Integer standardnum) {
        this.standardnum = standardnum;
    }

    public Double getLearningcoefficient() {
        return learningcoefficient;
    }

    public void setLearningcoefficient(Double learningcoefficient) {
        this.learningcoefficient = learningcoefficient;
    }

    public Double getCiency() {
        return ciency;
    }

    public void setCiency(Double ciency) {
        this.ciency = ciency;
    }
}