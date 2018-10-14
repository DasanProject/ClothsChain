package com.example.demo.entity;

public class Tab_pro {
    private Integer progressid;

    private String salesorder;

    private Integer cutnumber;

    private Integer worknumber;

    private Integer intputnumber;

    private Integer outnumber;

    private Integer accepetnumber;

    public Integer getProgressid() {
        return progressid;
    }

    public void setProgressid(Integer progressid) {
        this.progressid = progressid;
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder == null ? null : salesorder.trim();
    }

    public Integer getCutnumber() {
        return cutnumber;
    }

    public void setCutnumber(Integer cutnumber) {
        this.cutnumber = cutnumber;
    }

    public Integer getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(Integer worknumber) {
        this.worknumber = worknumber;
    }

    public Integer getIntputnumber() {
        return intputnumber;
    }

    public void setIntputnumber(Integer intputnumber) {
        this.intputnumber = intputnumber;
    }

    public Integer getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(Integer outnumber) {
        this.outnumber = outnumber;
    }

    public Integer getAccepetnumber() {
        return accepetnumber;
    }

    public void setAccepetnumber(Integer accepetnumber) {
        this.accepetnumber = accepetnumber;
    }
}