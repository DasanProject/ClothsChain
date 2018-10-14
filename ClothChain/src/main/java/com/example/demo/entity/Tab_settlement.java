package com.example.demo.entity;



public class Tab_settlement {
    private Integer settlementid;

    private String settlementno;

    private String storageno;

    private String reconciliationsno;

    private String requisitiondate;

    private String financestate;

    private String auditordate;

    private Double applymoney;

    private Double paymentmoney;

    private String applytype;

    private Integer applystate;

    private Double dyeingfee;

    private Double smallfee;

    private Double othermoney;

    private String remarks;

    private String ruditor;

    private String leaderapprover;

    private String batchdate;

    private Integer superlierid;

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementno() {
        return settlementno;
    }

    public void setSettlementno(String settlementno) {
        this.settlementno = settlementno == null ? null : settlementno.trim();
    }

    public String getStorageno() {
        return storageno;
    }

    public void setStorageno(String storageno) {
        this.storageno = storageno == null ? null : storageno.trim();
    }

    public String getReconciliationsno() {
        return reconciliationsno;
    }

    public void setReconciliationsno(String reconciliationsno) {
        this.reconciliationsno = reconciliationsno == null ? null : reconciliationsno.trim();
    }

    public String getRequisitiondate() {
        return requisitiondate;
    }

    public void setRequisitiondate(String requisitiondate) {
        this.requisitiondate = requisitiondate == null ? null : requisitiondate.trim();
    }

    public String getFinancestate() {
        return financestate;
    }

    public void setFinancestate(String financestate) {
        this.financestate = financestate == null ? null : financestate.trim();
    }

    public String getAuditordate() {
        return auditordate;
    }

    public void setAuditordate(String auditordate) {
        this.auditordate = auditordate == null ? null : auditordate.trim();
    }

    public Double getApplymoney() {
        return applymoney;
    }

    public void setApplymoney(Double applymoney) {
        this.applymoney = applymoney;
    }

    public Double getPaymentmoney() {
        return paymentmoney;
    }

    public void setPaymentmoney(Double paymentmoney) {
        this.paymentmoney = paymentmoney;
    }

    public String getApplytype() {
        return applytype;
    }

    public void setApplytype(String applytype) {
        this.applytype = applytype == null ? null : applytype.trim();
    }

    public Integer getApplystate() {
        return applystate;
    }

    public void setApplystate(Integer applystate) {
        this.applystate = applystate;
    }

    public Double getDyeingfee() {
        return dyeingfee;
    }

    public void setDyeingfee(Double dyeingfee) {
        this.dyeingfee = dyeingfee;
    }

    public Double getSmallfee() {
        return smallfee;
    }

    public void setSmallfee(Double smallfee) {
        this.smallfee = smallfee;
    }

    public Double getOthermoney() {
        return othermoney;
    }

    public void setOthermoney(Double othermoney) {
        this.othermoney = othermoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getRuditor() {
        return ruditor;
    }

    public void setRuditor(String ruditor) {
        this.ruditor = ruditor == null ? null : ruditor.trim();
    }

    public String getLeaderapprover() {
        return leaderapprover;
    }

    public void setLeaderapprover(String leaderapprover) {
        this.leaderapprover = leaderapprover == null ? null : leaderapprover.trim();
    }

    public String getBatchdate() {
        return batchdate;
    }

    public void setBatchdate(String batchdate) {
        this.batchdate = batchdate == null ? null : batchdate.trim();
    }

    public Integer getSuperlierid() {
        return superlierid;
    }

    public void setSuperlierid(Integer superlierid) {
        this.superlierid = superlierid;
    }
}