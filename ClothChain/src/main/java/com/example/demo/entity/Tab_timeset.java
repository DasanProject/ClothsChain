package com.example.demo.entity;

public class Tab_timeset {
    private Integer setid;

    private String groups;

    private String workdate;

    private Integer workhours;

    public Integer getSetid() {
        return setid;
    }

    public void setSetid(Integer setid) {
        this.setid = setid;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate == null ? null : workdate.trim();
    }

    public Integer getWorkhours() {
        return workhours;
    }

    public void setWorkhours(Integer workhours) {
        this.workhours = workhours;
    }
}