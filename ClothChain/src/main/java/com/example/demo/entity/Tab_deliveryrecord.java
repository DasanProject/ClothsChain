package com.example.demo.entity;



public class Tab_deliveryrecord {
    private Integer deliveryid;

    private String deliverydate;

    private String grouptype;

    private String salesorder;

    private Integer outnumber;

    private Integer productiontotal;

    private Double outtotal;

    private String po;

    private String stylenumber;

    private String color;

    private Double size;

    private String customerorder;

    private String customer;

    private String customerdelivery;

    private String quarter;

    private Integer isstatus;

    private String productionorder;

    private Double accpetnumber;

    public Integer getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate == null ? null : deliverydate.trim();
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype == null ? null : grouptype.trim();
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder == null ? null : salesorder.trim();
    }

    public Integer getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(Integer outnumber) {
        this.outnumber = outnumber;
    }

    public Integer getProductiontotal() {
        return productiontotal;
    }

    public void setProductiontotal(Integer productiontotal) {
        this.productiontotal = productiontotal;
    }

    public Double getOuttotal() {
        return outtotal;
    }

    public void setOuttotal(Double outtotal) {
        this.outtotal = outtotal;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po == null ? null : po.trim();
    }

    public String getStylenumber() {
        return stylenumber;
    }

    public void setStylenumber(String stylenumber) {
        this.stylenumber = stylenumber == null ? null : stylenumber.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getCustomerorder() {
        return customerorder;
    }

    public void setCustomerorder(String customerorder) {
        this.customerorder = customerorder == null ? null : customerorder.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomerdelivery() {
        return customerdelivery;
    }

    public void setCustomerdelivery(String customerdelivery) {
        this.customerdelivery = customerdelivery == null ? null : customerdelivery.trim();
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter == null ? null : quarter.trim();
    }

    public Integer getIsstatus() {
        return isstatus;
    }

    public void setIsstatus(Integer isstatus) {
        this.isstatus = isstatus;
    }

    public String getProductionorder() {
        return productionorder;
    }

    public void setProductionorder(String productionorder) {
        this.productionorder = productionorder == null ? null : productionorder.trim();
    }

    public Double getAccpetnumber() {
        return accpetnumber;
    }

    public void setAccpetnumber(Double accpetnumber) {
        this.accpetnumber = accpetnumber;
    }
}