package com.example.demo.entity;



public class Tab_sizetemplate {
    private Integer sizeid;

    private Integer customerid;

    private Integer styleid;

    private String buweino;

    private String buweiname;

    private Double positive;

    private Double negative;

    private String describle;

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getBuweino() {
        return buweino;
    }

    public void setBuweino(String buweino) {
        this.buweino = buweino == null ? null : buweino.trim();
    }

    public String getBuweiname() {
        return buweiname;
    }

    public void setBuweiname(String buweiname) {
        this.buweiname = buweiname == null ? null : buweiname.trim();
    }

    public Double getPositive() {
        return positive;
    }

    public void setPositive(Double positive) {
        this.positive = positive;
    }

    public Double getNegative() {
        return negative;
    }

    public void setNegative(Double negative) {
        this.negative = negative;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }
}