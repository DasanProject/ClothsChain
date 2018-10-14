package com.example.demo.entity;

public class Tab_function {
    private Integer functionid;

    private String functionname;

    private Integer funfunctionid;

    private String url;

    private Integer state;

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    public Integer getFunfunctionid() {
        return funfunctionid;
    }

    public void setFunfunctionid(Integer funfunctionid) {
        this.funfunctionid = funfunctionid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}