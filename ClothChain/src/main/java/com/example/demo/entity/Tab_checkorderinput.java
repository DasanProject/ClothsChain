package com.example.demo.entity;



public class Tab_checkorderinput {
    private Integer checkmessageid;

    private Integer typeinid;

    private String stylenumber;

    private String color;

    private Double size;

    private Integer status;

    private String checkpeople;

    private String checkdate;

    private String salesorder;

    private Integer clipid;

    private String depetname;

    private String po;

    private String clothid;

    private Integer goodstatus;

    private String grouptype;

    private String oddnumbers;

    private String packingno;

    public Integer getCheckmessageid() {
        return checkmessageid;
    }

    public void setCheckmessageid(Integer checkmessageid) {
        this.checkmessageid = checkmessageid;
    }

    public Integer getTypeinid() {
        return typeinid;
    }

    public void setTypeinid(Integer typeinid) {
        this.typeinid = typeinid;
    }

    public String getStylenumber() {
        return stylenumber;
    }

    public void setStylenumber(String stylenumber) {
        this.stylenumber = stylenumber == null ? null : stylenumber.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCheckpeople() {
        return checkpeople;
    }

    public void setCheckpeople(String checkpeople) {
        this.checkpeople = checkpeople == null ? null : checkpeople.trim();
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate == null ? null : checkdate.trim();
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder == null ? null : salesorder.trim();
    }

    public Integer getClipid() {
        return clipid;
    }

    public void setClipid(Integer clipid) {
        this.clipid = clipid;
    }

    public String getDepetname() {
        return depetname;
    }

    public void setDepetname(String depetname) {
        this.depetname = depetname == null ? null : depetname.trim();
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po == null ? null : po.trim();
    }

    public String getClothid() {
        return clothid;
    }

    public void setClothid(String clothid) {
        this.clothid = clothid == null ? null : clothid.trim();
    }

    public Integer getGoodstatus() {
        return goodstatus;
    }

    public void setGoodstatus(Integer goodstatus) {
        this.goodstatus = goodstatus;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype == null ? null : grouptype.trim();
    }

    public String getOddnumbers() {
        return oddnumbers;
    }

    public void setOddnumbers(String oddnumbers) {
        this.oddnumbers = oddnumbers == null ? null : oddnumbers.trim();
    }

    public String getPackingno() {
        return packingno;
    }

    public void setPackingno(String packingno) {
        this.packingno = packingno == null ? null : packingno.trim();
    }
}