package com.jxlg.mapper;

import com.jxlg.pojo.SubmitWeek;

public interface SubmitWeekMapper {
    int deleteByPrimaryKey(String submitWeekId);

    int insert(SubmitWeek record);

    int insertSelective(SubmitWeek record);

    SubmitWeek selectByPrimaryKey(String submitWeekId);

    int updateByPrimaryKeySelective(SubmitWeek record);

    int updateByPrimaryKey(SubmitWeek record);
    
}