package com.example.demo.entity;

public class Tab_otherplan {
    private Integer otherplanid;

    private String largetype;

    private String thing;

    private String chargepeople;

    private String plandate;

    private String complatedate;

    private String remark;

    private String orderno;

    public Integer getOtherplanid() {
        return otherplanid;
    }

    public void setOtherplanid(Integer otherplanid) {
        this.otherplanid = otherplanid;
    }

    public String getLargetype() {
        return largetype;
    }

    public void setLargetype(String largetype) {
        this.largetype = largetype == null ? null : largetype.trim();
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing == null ? null : thing.trim();
    }

    public String getChargepeople() {
        return chargepeople;
    }

    public void setChargepeople(String chargepeople) {
        this.chargepeople = chargepeople == null ? null : chargepeople.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}