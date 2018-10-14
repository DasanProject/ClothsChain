package com.example.demo.dao;

import com.example.demo.entity.Tab_rolefunction;
import com.example.demo.entity.Tab_rolefunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_rolefunctionMapper {
    int countByExample(Tab_rolefunctionExample example);

    int deleteByExample(Tab_rolefunctionExample example);

    int deleteByPrimaryKey(Integer rolefunctionid);

    int insert(Tab_rolefunction record);

    int insertSelective(Tab_rolefunction record);

    List<Tab_rolefunction> selectByExample(Tab_rolefunctionExample example);

    Tab_rolefunction selectByPrimaryKey(Integer rolefunctionid);

    int updateByExampleSelective(@Param("record") Tab_rolefunction record, @Param("example") Tab_rolefunctionExample example);

    int updateByExample(@Param("record") Tab_rolefunction record, @Param("example") Tab_rolefunctionExample example);

    int updateByPrimaryKeySelective(Tab_rolefunction record);

    int updateByPrimaryKey(Tab_rolefunction record);
}