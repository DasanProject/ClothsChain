package com.example.demo.dao;

import com.example.demo.entity.Tab_groupefficiency;
import com.example.demo.entity.Tab_groupefficiencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_groupefficiencyMapper {
    int countByExample(Tab_groupefficiencyExample example);

    int deleteByExample(Tab_groupefficiencyExample example);

    int deleteByPrimaryKey(Integer setid);

    int insert(Tab_groupefficiency record);

    int insertSelective(Tab_groupefficiency record);

    List<Tab_groupefficiency> selectByExample(Tab_groupefficiencyExample example);

    Tab_groupefficiency selectByPrimaryKey(Integer setid);

    int updateByExampleSelective(@Param("record") Tab_groupefficiency record, @Param("example") Tab_groupefficiencyExample example);

    int updateByExample(@Param("record") Tab_groupefficiency record, @Param("example") Tab_groupefficiencyExample example);

    int updateByPrimaryKeySelective(Tab_groupefficiency record);

    int updateByPrimaryKey(Tab_groupefficiency record);
}