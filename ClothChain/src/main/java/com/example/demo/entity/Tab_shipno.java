package com.example.demo.entity;

public class Tab_shipno {
    private Integer spid;

    private Integer customerid;

    private String noticno;

    private String expecteddate;

    private String outgodate;

    private String managers;

    private String relation;

    private String deli;

    private String orderno;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getNoticno() {
        return noticno;
    }

    public void setNoticno(String noticno) {
        this.noticno = noticno == null ? null : noticno.trim();
    }

    public String getExpecteddate() {
        return expecteddate;
    }

    public void setExpecteddate(String expecteddate) {
        this.expecteddate = expecteddate == null ? null : expecteddate.trim();
    }

    public String getOutgodate() {
        return outgodate;
    }

    public void setOutgodate(String outgodate) {
        this.outgodate = outgodate == null ? null : outgodate.trim();
    }

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers == null ? null : managers.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getDeli() {
        return deli;
    }

    public void setDeli(String deli) {
        this.deli = deli == null ? null : deli.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}