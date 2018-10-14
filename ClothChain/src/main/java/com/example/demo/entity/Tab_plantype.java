package com.example.demo.entity;

public class Tab_plantype {
    private Integer plantypeid;

    private String describle;

    private String setdate;

    private String remark;

    public Integer getPlantypeid() {
        return plantypeid;
    }

    public void setPlantypeid(Integer plantypeid) {
        this.plantypeid = plantypeid;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public String getSetdate() {
        return setdate;
    }

    public void setSetdate(String setdate) {
        this.setdate = setdate == null ? null : setdate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}