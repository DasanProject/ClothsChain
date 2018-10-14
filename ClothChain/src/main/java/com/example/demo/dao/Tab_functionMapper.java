package com.example.demo.dao;

import com.example.demo.entity.Tab_function;
import com.example.demo.entity.Tab_functionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_functionMapper {
    int countByExample(Tab_functionExample example);

    int deleteByExample(Tab_functionExample example);

    int deleteByPrimaryKey(Integer functionid);

    int insert(Tab_function record);

    int insertSelective(Tab_function record);

    List<Tab_function> selectByExample(Tab_functionExample example);

    Tab_function selectByPrimaryKey(Integer functionid);

    int updateByExampleSelective(@Param("record") Tab_function record, @Param("example") Tab_functionExample example);

    int updateByExample(@Param("record") Tab_function record, @Param("example") Tab_functionExample example);

    int updateByPrimaryKeySelective(Tab_function record);

    int updateByPrimaryKey(Tab_function record);
}