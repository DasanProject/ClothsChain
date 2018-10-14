package com.example.demo.dao;

import com.example.demo.entity.Tab_color;
import com.example.demo.entity.Tab_colorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_colorMapper {
    int countByExample(Tab_colorExample example);

    int deleteByExample(Tab_colorExample example);

    int deleteByPrimaryKey(Integer colorid);

    int insert(Tab_color record);

    int insertSelective(Tab_color record);

    List<Tab_color> selectByExample(Tab_colorExample example);

    Tab_color selectByPrimaryKey(Integer colorid);

    int updateByExampleSelective(@Param("record") Tab_color record, @Param("example") Tab_colorExample example);

    int updateByExample(@Param("record") Tab_color record, @Param("example") Tab_colorExample example);

    int updateByPrimaryKeySelective(Tab_color record);

    int updateByPrimaryKey(Tab_color record);
}