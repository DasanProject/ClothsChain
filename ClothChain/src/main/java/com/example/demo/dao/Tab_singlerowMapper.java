package com.example.demo.dao;

import com.example.demo.entity.Tab_singlerow;
import com.example.demo.entity.Tab_singlerowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_singlerowMapper {
    int countByExample(Tab_singlerowExample example);

    int deleteByExample(Tab_singlerowExample example);

    int deleteByPrimaryKey(Integer singleid);

    int insert(Tab_singlerow record);

    int insertSelective(Tab_singlerow record);

    List<Tab_singlerow> selectByExample(Tab_singlerowExample example);

    Tab_singlerow selectByPrimaryKey(Integer singleid);

    int updateByExampleSelective(@Param("record") Tab_singlerow record, @Param("example") Tab_singlerowExample example);

    int updateByExample(@Param("record") Tab_singlerow record, @Param("example") Tab_singlerowExample example);

    int updateByPrimaryKeySelective(Tab_singlerow record);

    int updateByPrimaryKey(Tab_singlerow record);
}