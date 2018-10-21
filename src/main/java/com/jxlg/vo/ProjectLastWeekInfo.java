package com.jxlg.vo;

/**
 * Created by Administrator on 2018/11/16.
 */
public class ProjectLastWeekInfo {
    private String lastWeekId;
    private String projectNo;
    private String projectName;
    private String projectManager;
    private String thisOrNext;
    private String submitWeekName;
    private String submitWeekId;

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    private String weekName;



    public String getLastWeekId() {
        return lastWeekId;
    }

    public void setLastWeekId(String lastWeekId) {
        this.lastWeekId = lastWeekId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getThisOrNext() {
        return thisOrNext;
    }

    public void setThisOrNext(String thisOrNext) {
        this.thisOrNext = thisOrNext;
    }

    public String getSubmitWeekName() {
        return submitWeekName;
    }

    public void setSubmitWeekName(String submitWeekName) {
        this.submitWeekName = submitWeekName;
    }

    public String getSubmitWeekId() {
        return submitWeekId;
    }

    public void setSubmitWeekId(String submitWeekId) {
        this.submitWeekId = submitWeekId;
    }

    @Override
    public String toString() {
        return "ProjectLastWeekInfo{" +
                "lastWeekId='" + lastWeekId + '\'' +
                ", projectNo='" + projectNo + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectManager='" + projectManager + '\'' +
                ", thisOrNext='" + thisOrNext + '\'' +
                ", submitWeekName='" + submitWeekName + '\'' +
                ", submitWeekId='" + submitWeekId + '\'' +
                ", weekName='" + weekName + '\'' +
                '}';
    }
}
