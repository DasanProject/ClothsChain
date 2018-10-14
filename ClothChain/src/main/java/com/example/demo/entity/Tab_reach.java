package com.example.demo.entity;

public class Tab_reach {
    private Integer reachid;

    private String materialno;

    private String materialname;

    private String plandate;

    private String complatedate;

    private String supperliar;

    private String saleno;

    private String opendate;

    public Integer getReachid() {
        return reachid;
    }

    public void setReachid(Integer reachid) {
        this.reachid = reachid;
    }

    public String getMaterialno() {
        return materialno;
    }

    public void setMaterialno(String materialno) {
        this.materialno = materialno == null ? null : materialno.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
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

    public String getSupperliar() {
        return supperliar;
    }

    public void setSupperliar(String supperliar) {
        this.supperliar = supperliar == null ? null : supperliar.trim();
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno == null ? null : saleno.trim();
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate == null ? null : opendate.trim();
    }
}