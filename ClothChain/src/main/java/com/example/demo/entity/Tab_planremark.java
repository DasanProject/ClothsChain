package com.example.demo.entity;

public class Tab_planremark {
    private Integer planremarkid;

    private Integer procurentid;

    private Integer reachid;

    private Integer productplanid;

    private Integer otherplanid;

    private String saleno;

    private String remark;

    private String operater;

    private String operdate;

    public Integer getPlanremarkid() {
        return planremarkid;
    }

    public void setPlanremarkid(Integer planremarkid) {
        this.planremarkid = planremarkid;
    }

    public Integer getProcurentid() {
        return procurentid;
    }

    public void setProcurentid(Integer procurentid) {
        this.procurentid = procurentid;
    }

    public Integer getReachid() {
        return reachid;
    }

    public void setReachid(Integer reachid) {
        this.reachid = reachid;
    }

    public Integer getProductplanid() {
        return productplanid;
    }

    public void setProductplanid(Integer productplanid) {
        this.productplanid = productplanid;
    }

    public Integer getOtherplanid() {
        return otherplanid;
    }

    public void setOtherplanid(Integer otherplanid) {
        this.otherplanid = otherplanid;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno == null ? null : saleno.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }

    public String getOperdate() {
        return operdate;
    }

    public void setOperdate(String operdate) {
        this.operdate = operdate == null ? null : operdate.trim();
    }
}