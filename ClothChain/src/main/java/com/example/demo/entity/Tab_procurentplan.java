package com.example.demo.entity;

public class Tab_procurentplan {
    private Integer procurentid;

    private String saleno;

    private String materialno;

    private String materialname;

    private String chargepeople;

    private String expecteddate;

    private String complatedate;

    public Integer getProcurentid() {
        return procurentid;
    }

    public void setProcurentid(Integer procurentid) {
        this.procurentid = procurentid;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno == null ? null : saleno.trim();
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

    public String getChargepeople() {
        return chargepeople;
    }

    public void setChargepeople(String chargepeople) {
        this.chargepeople = chargepeople == null ? null : chargepeople.trim();
    }

    public String getExpecteddate() {
        return expecteddate;
    }

    public void setExpecteddate(String expecteddate) {
        this.expecteddate = expecteddate == null ? null : expecteddate.trim();
    }

    public String getComplatedate() {
        return complatedate;
    }

    public void setComplatedate(String complatedate) {
        this.complatedate = complatedate == null ? null : complatedate.trim();
    }
}