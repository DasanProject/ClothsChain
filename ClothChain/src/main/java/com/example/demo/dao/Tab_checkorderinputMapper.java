package com.example.demo.dao;

import com.example.demo.entity.Tab_checkorderinput;
import com.example.demo.entity.Tab_checkorderinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_checkorderinputMapper {
    int countByExample(Tab_checkorderinputExample example);

    int deleteByExample(Tab_checkorderinputExample example);

    int deleteByPrimaryKey(Integer checkmessageid);

    int insert(Tab_checkorderinput record);

    int insertSelective(Tab_checkorderinput record);

    List<Tab_checkorderinput> selectByExample(Tab_checkorderinputExample example);

    Tab_checkorderinput selectByPrimaryKey(Integer checkmessageid);

    int updateByExampleSelective(@Param("record") Tab_checkorderinput record, @Param("example") Tab_checkorderinputExample example);

    int updateByExample(@Param("record") Tab_checkorderinput record, @Param("example") Tab_checkorderinputExample example);

    int updateByPrimaryKeySelective(Tab_checkorderinput record);

    int updateByPrimaryKey(Tab_checkorderinput record);
}