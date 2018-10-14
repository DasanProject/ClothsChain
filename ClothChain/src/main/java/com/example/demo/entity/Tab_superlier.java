package com.example.demo.entity;

public class Tab_superlier {
    private Integer superlierid;

    private String superliername;

    private Integer state;

    private String remark;

    private String people;

    private String phone;

    private String address;

    private String websute;

    private Integer day;

    private String bank;

    private String bankaccount;

    private String contecttitle;

    private String fax;

    private String postalcode;

    private String email;

    public Integer getSuperlierid() {
        return superlierid;
    }

    public void setSuperlierid(Integer superlierid) {
        this.superlierid = superlierid;
    }

    public String getSuperliername() {
        return superliername;
    }

    public void setSuperliername(String superliername) {
        this.superliername = superliername == null ? null : superliername.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWebsute() {
        return websute;
    }

    public void setWebsute(String websute) {
        this.websute = websute == null ? null : websute.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getContecttitle() {
        return contecttitle;
    }

    public void setContecttitle(String contecttitle) {
        this.contecttitle = contecttitle == null ? null : contecttitle.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}