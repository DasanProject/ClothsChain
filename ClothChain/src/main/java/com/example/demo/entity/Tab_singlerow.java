package com.example.demo.entity;

public class Tab_singlerow {
    private Integer singleid;

    private String groups;

    private String orderno;

    private Integer singlenumber;

    private String begindate;

    private String enddate;

    private String overdate;

    private String remark;

    public Integer getSingleid() {
        return singleid;
    }

    public void setSingleid(Integer singleid) {
        this.singleid = singleid;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getSinglenumber() {
        return singlenumber;
    }

    public void setSinglenumber(Integer singlenumber) {
        this.singlenumber = singlenumber;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getOverdate() {
        return overdate;
    }

    public void setOverdate(String overdate) {
        this.overdate = overdate == null ? null : overdate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}