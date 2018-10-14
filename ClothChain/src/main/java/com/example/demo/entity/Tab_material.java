package com.example.demo.entity;



public class Tab_material {
    private Integer materialid;

    private Integer superlierid;

    private Integer categoryid;

    private String materialnum;

    private String materialname;

    private String modal;

    private Integer state;

    private Integer auditstatu;

    private String remark;

    private String basis;

    private Double shrinkage;

    private Double weight;

    private Integer num;

    private Double price;

    private String unit;

    private Integer startnum;

    private String color;

    private String size;

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public Integer getSuperlierid() {
        return superlierid;
    }

    public void setSuperlierid(Integer superlierid) {
        this.superlierid = superlierid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(String materialnum) {
        this.materialnum = materialnum == null ? null : materialnum.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal == null ? null : modal.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAuditstatu() {
        return auditstatu;
    }

    public void setAuditstatu(Integer auditstatu) {
        this.auditstatu = auditstatu;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis == null ? null : basis.trim();
    }

    public Double getShrinkage() {
        return shrinkage;
    }

    public void setShrinkage(Double shrinkage) {
        this.shrinkage = shrinkage;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getStartnum() {
        return startnum;
    }

    public void setStartnum(Integer startnum) {
        this.startnum = startnum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}