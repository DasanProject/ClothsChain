package com.example.demo.entity;

public class Tab_sampletype {
    private Integer sampletypeid;

    private String sampletypename;

    private String remark;

    public Integer getSampletypeid() {
        return sampletypeid;
    }

    public void setSampletypeid(Integer sampletypeid) {
        this.sampletypeid = sampletypeid;
    }

    public String getSampletypename() {
        return sampletypename;
    }

    public void setSampletypename(String sampletypename) {
        this.sampletypename = sampletypename == null ? null : sampletypename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}