package com.example.demo.entity;

public class Tab_quarterly {
    private Integer quarterlyid;

    private String quarterlyno;

    private String describle;

    public Integer getQuarterlyid() {
        return quarterlyid;
    }

    public void setQuarterlyid(Integer quarterlyid) {
        this.quarterlyid = quarterlyid;
    }

    public String getQuarterlyno() {
        return quarterlyno;
    }

    public void setQuarterlyno(String quarterlyno) {
        this.quarterlyno = quarterlyno == null ? null : quarterlyno.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }
}