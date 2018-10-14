package com.example.demo.entity;



public class Tab_admission {
    private Integer admissionid;

    private String orderno;

    private Double admissionmoney;

    private Integer duenum;

    private String duedate;

    private String duepeople;

    public Integer getAdmissionid() {
        return admissionid;
    }

    public void setAdmissionid(Integer admissionid) {
        this.admissionid = admissionid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Double getAdmissionmoney() {
        return admissionmoney;
    }

    public void setAdmissionmoney(Double admissionmoney) {
        this.admissionmoney = admissionmoney;
    }

    public Integer getDuenum() {
        return duenum;
    }

    public void setDuenum(Integer duenum) {
        this.duenum = duenum;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate == null ? null : duedate.trim();
    }

    public String getDuepeople() {
        return duepeople;
    }

    public void setDuepeople(String duepeople) {
        this.duepeople = duepeople == null ? null : duepeople.trim();
    }
}