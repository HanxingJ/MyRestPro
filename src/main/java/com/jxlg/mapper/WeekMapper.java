package com.jxlg.mapper;

import com.jxlg.pojo.Week;

public interface WeekMapper {
    int deleteByPrimaryKey(String weekId);

    int insert(Week record);

    int insertSelective(Week record);

    Week selectByPrimaryKey(String weekId);

    int updateByPrimaryKeySelective(Week record);

    int updateByPrimaryKey(Week record);
}