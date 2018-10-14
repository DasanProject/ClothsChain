package com.example.demo.dao;

import com.example.demo.entity.Tab_sampletype;
import com.example.demo.entity.Tab_sampletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_sampletypeMapper {
    int countByExample(Tab_sampletypeExample example);

    int deleteByExample(Tab_sampletypeExample example);

    int deleteByPrimaryKey(Integer sampletypeid);

    int insert(Tab_sampletype record);

    int insertSelective(Tab_sampletype record);

    List<Tab_sampletype> selectByExample(Tab_sampletypeExample example);

    Tab_sampletype selectByPrimaryKey(Integer sampletypeid);

    int updateByExampleSelective(@Param("record") Tab_sampletype record, @Param("example") Tab_sampletypeExample example);

    int updateByExample(@Param("record") Tab_sampletype record, @Param("example") Tab_sampletypeExample example);

    int updateByPrimaryKeySelective(Tab_sampletype record);

    int updateByPrimaryKey(Tab_sampletype record);
}