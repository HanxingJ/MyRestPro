package test;

import com.jxlg.mapper.ProjectMapper;
import com.jxlg.pojo.Project;
import com.jxlg.vo.ProjectLastWeekInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations="classpath:spring/applicationContext-*.xml")
public class TestProjectMapper {
    @Autowired
    private ProjectMapper projectMapper;

    @Test
    public void test(){
        List<ProjectLastWeekInfo> projectLastWeekInfoList = projectMapper.selectAllInfo();
        System.out.println(projectLastWeekInfoList);

    }

    @Test
    public void test2(){
        Project project = projectMapper.selectByPrimaryKey("0000001");
        System.out.println(project);
    }
}
