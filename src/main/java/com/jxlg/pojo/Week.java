package com.jxlg.pojo;

public class Week {
    private String weekId;

    private String weekName;

    public Week(String weekId, String weekName) {
        this.weekId = weekId;
        this.weekName = weekName;
    }

    public Week() {
        super();
    }

    public String getWeekId() {
        return weekId;
    }

    public void setWeekId(String weekId) {
        this.weekId = weekId == null ? null : weekId.trim();
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName == null ? null : weekName.trim();
    }
}