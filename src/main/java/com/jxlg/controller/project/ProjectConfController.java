package com.jxlg.controller.project;

import com.jxlg.pojo.Project;
import com.jxlg.pojo.Result;
import com.jxlg.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by Administrator on 2018/11/16.
 */
@RestController
public class ProjectConfController {
    @Autowired
    private ProjectService projectService;

    //查询所有项目信息
    @RequestMapping(value = "/projects",method = RequestMethod.GET)
    public Result findAll(){
        return projectService.selectAllInfo();
    }

    //根据id查询项目信息
    @RequestMapping(value = "/project/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id){
        return projectService.selectInfoById(id);
    }

    //根据id删除项目信息
    @RequestMapping(value = "/project/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") String id){
        return projectService.deleteById(id);
    }

    //添加项目信息
    @RequestMapping(value = "/project",method = RequestMethod.POST)
    public Result insertProject(Project project){
        return projectService.insertProject(project);
    }

    //提交修改项目信息
    @RequestMapping(value = "/project",method = RequestMethod.PUT)
    public Result modifyProject(Project project){
        return projectService.modifyProject(project);
    }

}
