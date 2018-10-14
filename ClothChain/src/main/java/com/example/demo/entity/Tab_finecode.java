package com.example.demo.entity;

public class Tab_finecode {
    private Integer fincodeid;

    private String sampleno;

    private String color;

    private String size;

    private Integer num;

    private String deliverydate;

    private String destination;

    private String po;

    private Integer cutnum;

    private Integer makenum;

    private Integer shippednum;

    private Integer unshippednum;

    public Integer getFincodeid() {
        return fincodeid;
    }

    public void setFincodeid(Integer fincodeid) {
        this.fincodeid = fincodeid;
    }

    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno == null ? null : sampleno.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate == null ? null : deliverydate.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po == null ? null : po.trim();
    }

    public Integer getCutnum() {
        return cutnum;
    }

    public void setCutnum(Integer cutnum) {
        this.cutnum = cutnum;
    }

    public Integer getMakenum() {
        return makenum;
    }

    public void setMakenum(Integer makenum) {
        this.makenum = makenum;
    }

    public Integer getShippednum() {
        return shippednum;
    }

    public void setShippednum(Integer shippednum) {
        this.shippednum = shippednum;
    }

    public Integer getUnshippednum() {
        return unshippednum;
    }

    public void setUnshippednum(Integer unshippednum) {
        this.unshippednum = unshippednum;
    }
}