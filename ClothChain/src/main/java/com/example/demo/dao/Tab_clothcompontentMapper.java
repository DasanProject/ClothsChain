package com.example.demo.dao;

import com.example.demo.entity.Tab_clothcompontent;
import com.example.demo.entity.Tab_clothcompontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_clothcompontentMapper {
    int countByExample(Tab_clothcompontentExample example);

    int deleteByExample(Tab_clothcompontentExample example);

    int deleteByPrimaryKey(Integer compontentid);

    int insert(Tab_clothcompontent record);

    int insertSelective(Tab_clothcompontent record);

    List<Tab_clothcompontent> selectByExample(Tab_clothcompontentExample example);

    Tab_clothcompontent selectByPrimaryKey(Integer compontentid);

    int updateByExampleSelective(@Param("record") Tab_clothcompontent record, @Param("example") Tab_clothcompontentExample example);

    int updateByExample(@Param("record") Tab_clothcompontent record, @Param("example") Tab_clothcompontentExample example);

    int updateByPrimaryKeySelective(Tab_clothcompontent record);

    int updateByPrimaryKey(Tab_clothcompontent record);
}