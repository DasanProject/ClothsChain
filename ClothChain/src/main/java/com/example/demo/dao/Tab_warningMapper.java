package com.example.demo.dao;

import com.example.demo.entity.Tab_warning;
import com.example.demo.entity.Tab_warningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_warningMapper {
    int countByExample(Tab_warningExample example);

    int deleteByExample(Tab_warningExample example);

    int deleteByPrimaryKey(Integer setupid);

    int insert(Tab_warning record);

    int insertSelective(Tab_warning record);

    List<Tab_warning> selectByExample(Tab_warningExample example);

    Tab_warning selectByPrimaryKey(Integer setupid);

    int updateByExampleSelective(@Param("record") Tab_warning record, @Param("example") Tab_warningExample example);

    int updateByExample(@Param("record") Tab_warning record, @Param("example") Tab_warningExample example);

    int updateByPrimaryKeySelective(Tab_warning record);

    int updateByPrimaryKey(Tab_warning record);
}