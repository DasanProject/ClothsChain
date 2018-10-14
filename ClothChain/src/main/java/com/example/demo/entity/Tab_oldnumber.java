package com.example.demo.entity;

public class Tab_oldnumber {
    private Integer oldnumber;

    private String describle;

    private String prefix;

    private Integer number;

    private String remark;

    public Integer getOldnumber() {
        return oldnumber;
    }

    public void setOldnumber(Integer oldnumber) {
        this.oldnumber = oldnumber;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}