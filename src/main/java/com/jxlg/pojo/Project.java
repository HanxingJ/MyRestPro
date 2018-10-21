package com.jxlg.pojo;

public class Project {
    private String lastWeekId;

    private String projectNo;

    private String projectName;

    private String projectManager;

    private String submitWeekId;

    private String thisOrNext;

    public Project(String lastWeekId, String projectNo, String projectName, String projectManager, String submitWeekId, String thisOrNext) {
        this.lastWeekId = lastWeekId;
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.submitWeekId = submitWeekId;
        this.thisOrNext = thisOrNext;
    }

    public Project() {

    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public String getLastWeekId() {
        return lastWeekId;
    }

    public void setLastWeekId(String lastWeekId) {
        this.lastWeekId = lastWeekId;
    }

    public String getSubmitWeekId() {
        return submitWeekId;
    }

    public void setSubmitWeekId(String submitWeekId) {
        this.submitWeekId = submitWeekId;
    }

    public String getThisOrNext() {
        return thisOrNext;
    }

    public void setThisOrNext(String thisOrNext) {
        this.thisOrNext = thisOrNext;
    }

    @Override
    public String toString() {
        return "Project{" +
                "lastWeekId='" + lastWeekId + '\'' +
                ", projectNo='" + projectNo + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectManager='" + projectManager + '\'' +
                ", submitWeekId='" + submitWeekId + '\'' +
                ", thisOrNext='" + thisOrNext + '\'' +
                '}';
    }
}