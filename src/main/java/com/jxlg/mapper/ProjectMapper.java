package com.jxlg.mapper;

import com.jxlg.pojo.Project;
import com.jxlg.vo.ProjectLastWeekInfo;

import java.util.List;

public interface ProjectMapper {
    int deleteByPrimaryKey(String projectNo);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(String last_week_id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<ProjectLastWeekInfo> selectAllInfo();
}