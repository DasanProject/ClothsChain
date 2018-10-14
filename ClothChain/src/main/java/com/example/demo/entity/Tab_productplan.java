package com.example.demo.entity;

public class Tab_productplan {
    private Integer productplanid;

    private String planthing;

    private String plandate;

    private String complatedate;

    private String progroup;

    private String chargepaople;

    private String orderno;

    public Integer getProductplanid() {
        return productplanid;
    }

    public void setProductplanid(Integer productplanid) {
        this.productplanid = productplanid;
    }

    public String getPlanthing() {
        return planthing;
    }

    public void setPlanthing(String planthing) {
        this.planthing = planthing == null ? null : planthing.trim();
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate == null ? null : plandate.trim();
    }

    public String getComplatedate() {
        return complatedate;
    }

    public void setComplatedate(String complatedate) {
        this.complatedate = complatedate == null ? null : complatedate.trim();
    }

    public String getProgroup() {
        return progroup;
    }

    public void setProgroup(String progroup) {
        this.progroup = progroup == null ? null : progroup.trim();
    }

    public String getChargepaople() {
        return chargepaople;
    }

    public void setChargepaople(String chargepaople) {
        this.chargepaople = chargepaople == null ? null : chargepaople.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}