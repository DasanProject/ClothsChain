package com.example.demo.entity;



public class Tab_brand {
    private Integer brandid;

    private Integer customerid;

    private String brandnum;

    private String brandname;

    private String brandfullname;

    private Double samplemultiple;

    private String remark;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getBrandnum() {
        return brandnum;
    }

    public void setBrandnum(String brandnum) {
        this.brandnum = brandnum == null ? null : brandnum.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandfullname() {
        return brandfullname;
    }

    public void setBrandfullname(String brandfullname) {
        this.brandfullname = brandfullname == null ? null : brandfullname.trim();
    }

    public Double getSamplemultiple() {
        return samplemultiple;
    }

    public void setSamplemultiple(Double samplemultiple) {
        this.samplemultiple = samplemultiple;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}