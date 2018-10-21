package com.jxlg.service;

import com.jxlg.pojo.Project;
import com.jxlg.pojo.Result;
import com.jxlg.vo.ProjectLastWeekInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
public interface ProjectService {
    //查询所有
    Result<List<ProjectLastWeekInfo>> selectAllInfo();
    //根据id查询
    Result<Project> selectInfoById(String id);
    //根据id删除
    Result deleteById(String id);
    //添加项目信息
    Result insertProject(Project project);
    //修改项目信息
    Result modifyProject(Project project);
}
