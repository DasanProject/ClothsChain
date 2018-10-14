package com.example.demo.entity;

public class Tab_planmatter {
    private Integer planmatterid;

    private Integer plantypeid;

    private String planmatter;

    private Integer plantype;

    private Integer warnday;

    private Integer transday;

    private String plandate;

    private Integer nodesday;

    private Integer warnstate;

    private Integer imports;

    private String materialnode;

    private String purchsingnode;

    public Integer getPlanmatterid() {
        return planmatterid;
    }

    public void setPlanmatterid(Integer planmatterid) {
        this.planmatterid = planmatterid;
    }

    public Integer getPlantypeid() {
        return plantypeid;
    }

    public void setPlantypeid(Integer plantypeid) {
        this.plantypeid = plantypeid;
    }

    public String getPlanmatter() {
        return planmatter;
    }

    public void setPlanmatter(String planmatter) {
        this.planmatter = planmatter == null ? null : planmatter.trim();
    }

    public Integer getPlantype() {
        return plantype;
    }

    public void setPlantype(Integer plantype) {
        this.plantype = plantype;
    }

    public Integer getWarnday() {
        return warnday;
    }

    public void setWarnday(Integer warnday) {
        this.warnday = warnday;
    }

    public Integer getTransday() {
        return transday;
    }

    public void setTransday(Integer transday) {
        this.transday = transday;
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate == null ? null : plandate.trim();
    }

    public Integer getNodesday() {
        return nodesday;
    }

    public void setNodesday(Integer nodesday) {
        this.nodesday = nodesday;
    }

    public Integer getWarnstate() {
        return warnstate;
    }

    public void setWarnstate(Integer warnstate) {
        this.warnstate = warnstate;
    }

    public Integer getImports() {
        return imports;
    }

    public void setImport(Integer imports) {
        this.imports = imports;
    }

    public String getMaterialnode() {
        return materialnode;
    }

    public void setMaterialnode(String materialnode) {
        this.materialnode = materialnode == null ? null : materialnode.trim();
    }

    public String getPurchsingnode() {
        return purchsingnode;
    }

    public void setPurchsingnode(String purchsingnode) {
        this.purchsingnode = purchsingnode == null ? null : purchsingnode.trim();
    }
}