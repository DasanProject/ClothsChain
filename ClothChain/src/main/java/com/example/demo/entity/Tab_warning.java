package com.example.demo.entity;



public class Tab_warning {
    private Integer setupid;

    private String materielno;

    private String type;

    private String materielname;

    private Double higheststock;

    private Double lowststock;

    private String cloer;

    private String specifications;

    private String company;

    public Integer getSetupid() {
        return setupid;
    }

    public void setSetupid(Integer setupid) {
        this.setupid = setupid;
    }

    public String getMaterielno() {
        return materielno;
    }

    public void setMaterielno(String materielno) {
        this.materielno = materielno == null ? null : materielno.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMaterielname() {
        return materielname;
    }

    public void setMaterielname(String materielname) {
        this.materielname = materielname == null ? null : materielname.trim();
    }

    public Double getHigheststock() {
        return higheststock;
    }

    public void setHigheststock(Double higheststock) {
        this.higheststock = higheststock;
    }

    public Double getLowststock() {
        return lowststock;
    }

    public void setLowststock(Double lowststock) {
        this.lowststock = lowststock;
    }

    public String getCloer() {
        return cloer;
    }

    public void setCloer(String cloer) {
        this.cloer = cloer == null ? null : cloer.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}