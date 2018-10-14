package com.example.demo.entity;

public class Tab_finishedproduct {
    private Integer inid;

    private String finishedproductsid;

    private Integer intputwarehouse;

    private String salesorder;

    private String quarter;

    private String stylenumber;

    private String destination;

    private String outdate;

    private Integer totalnumber;

    private String warehouse;

    private String danjudate;

    private Integer isstatus;

    private Integer inputnumber;

    private String intputdate;

    private Integer outnumber;

    private Integer customerid;

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getFinishedproductsid() {
        return finishedproductsid;
    }

    public void setFinishedproductsid(String finishedproductsid) {
        this.finishedproductsid = finishedproductsid == null ? null : finishedproductsid.trim();
    }

    public Integer getIntputwarehouse() {
        return intputwarehouse;
    }

    public void setIntputwarehouse(Integer intputwarehouse) {
        this.intputwarehouse = intputwarehouse;
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder == null ? null : salesorder.trim();
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter == null ? null : quarter.trim();
    }

    public String getStylenumber() {
        return stylenumber;
    }

    public void setStylenumber(String stylenumber) {
        this.stylenumber = stylenumber == null ? null : stylenumber.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate == null ? null : outdate.trim();
    }

    public Integer getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(Integer totalnumber) {
        this.totalnumber = totalnumber;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getDanjudate() {
        return danjudate;
    }

    public void setDanjudate(String danjudate) {
        this.danjudate = danjudate == null ? null : danjudate.trim();
    }

    public Integer getIsstatus() {
        return isstatus;
    }

    public void setIsstatus(Integer isstatus) {
        this.isstatus = isstatus;
    }

    public Integer getInputnumber() {
        return inputnumber;
    }

    public void setInputnumber(Integer inputnumber) {
        this.inputnumber = inputnumber;
    }

    public String getIntputdate() {
        return intputdate;
    }

    public void setIntputdate(String intputdate) {
        this.intputdate = intputdate == null ? null : intputdate.trim();
    }

    public Integer getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(Integer outnumber) {
        this.outnumber = outnumber;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
}