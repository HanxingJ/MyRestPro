package com.jxlg.service.impl;

import com.jxlg.mapper.ProjectMapper;
import com.jxlg.pojo.Project;
import com.jxlg.pojo.Result;
import com.jxlg.service.ProjectService;
import com.jxlg.utils.ResultUtil;
import com.jxlg.vo.ProjectLastWeekInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectMapper projectMapper;


    //查询所有信息
    @Override
    public Result<List<ProjectLastWeekInfo>> selectAllInfo() {
        Result<List<ProjectLastWeekInfo>> result;
        try {
            List<ProjectLastWeekInfo> projectLastWeekInfos = projectMapper.selectAllInfo();
            result = ResultUtil.success(projectLastWeekInfos);
        }catch (Exception e){
            e.printStackTrace();
            result = ResultUtil.failed();
            return result;
        }

        return result;
    }

    //根据id查询信息
    @Override
    public Result<Project> selectInfoById(String id) {
        Result<Project> result;
        try {
            Project project = projectMapper.selectByPrimaryKey(id);
            result = ResultUtil.success(project);
        } catch (Exception e) {
            e.printStackTrace();
            result = ResultUtil.failed();
            return result;
        }
        return result;
    }

    //根据id删除项目信息
    @Override
    public Result deleteById(String id) {
        Result<String> result;
        try {
            int i = projectMapper.deleteByPrimaryKey(id);
            if(i>0){
                result = ResultUtil.success("删除成功！");
                return result;
            }
            result = ResultUtil.failed("删除失败，没有对应的id");
        } catch (Exception e) {
            e.printStackTrace();
           result = ResultUtil.failed("删除失败，出现异常！");
           return result;
        }
        return result;
    }

    //新增项目信息
    @Override
    public Result insertProject(Project project) {
        Result<Project> result;
        try {
            int insert = projectMapper.insert(project);
            if(insert>0){
                result = ResultUtil.success("新增成功！");
                return result;
            }
            result = ResultUtil.failed("新增失败！请不要重复插入！");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResultUtil.failed("新增失败！出现异常！");
            return result;
        }
        return result;
    }

    //修改项目信息
    @Override
    public Result modifyProject(Project project) {
        Result result;
        try {
            int i = projectMapper.updateByPrimaryKeySelective(project);
            if(i>0){
                result = ResultUtil.success("修改成功！");
                return result;
            }
            result = ResultUtil.failed("修改失败，请按要求输入！");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResultUtil.failed("修改失败！出现异常！");
            return result;
        }
        return result;
    }
}
