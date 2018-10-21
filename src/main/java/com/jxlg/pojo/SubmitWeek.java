package com.jxlg.pojo;

public class SubmitWeek {
    private String submitWeekId;

    private String submitWeekName;

    public SubmitWeek(String submitWeekId, String submitWeekName) {
        this.submitWeekId = submitWeekId;
        this.submitWeekName = submitWeekName;
    }

    public SubmitWeek() {
        super();
    }

    public String getSubmitWeekId() {
        return submitWeekId;
    }

    public void setSubmitWeekId(String submitWeekId) {
        this.submitWeekId = submitWeekId == null ? null : submitWeekId.trim();
    }

    public String getSubmitWeekName() {
        return submitWeekName;
    }

    public void setSubmitWeekName(String submitWeekName) {
        this.submitWeekName = submitWeekName == null ? null : submitWeekName.trim();
    }
}