package com.example.demo.entity;



public class Tab_samplesize {
    private Integer samplesizeid;

    private String sampleno;

    private String customerlocation;

    private String location;

    private String metricmethod;

    private String samplesize;

    private String describle;

    private Double positive;

    private Double negative;

    private Integer size;

    public Integer getSamplesizeid() {
        return samplesizeid;
    }

    public void setSamplesizeid(Integer samplesizeid) {
        this.samplesizeid = samplesizeid;
    }

    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno == null ? null : sampleno.trim();
    }

    public String getCustomerlocation() {
        return customerlocation;
    }

    public void setCustomerlocation(String customerlocation) {
        this.customerlocation = customerlocation == null ? null : customerlocation.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getMetricmethod() {
        return metricmethod;
    }

    public void setMetricmethod(String metricmethod) {
        this.metricmethod = metricmethod == null ? null : metricmethod.trim();
    }

    public String getSamplesize() {
        return samplesize;
    }

    public void setSamplesize(String samplesize) {
        this.samplesize = samplesize == null ? null : samplesize.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public Double getPositive() {
        return positive;
    }

    public void setPositive(Double positive) {
        this.positive = positive;
    }

    public Double getNegative() {
        return negative;
    }

    public void setNegative(Double negative) {
        this.negative = negative;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}