package com.example.demo.dao;

import com.example.demo.entity.Tab_samplesize;
import com.example.demo.entity.Tab_samplesizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_samplesizeMapper {
    int countByExample(Tab_samplesizeExample example);

    int deleteByExample(Tab_samplesizeExample example);

    int deleteByPrimaryKey(Integer samplesizeid);

    int insert(Tab_samplesize record);

    int insertSelective(Tab_samplesize record);

    List<Tab_samplesize> selectByExample(Tab_samplesizeExample example);

    Tab_samplesize selectByPrimaryKey(Integer samplesizeid);

    int updateByExampleSelective(@Param("record") Tab_samplesize record, @Param("example") Tab_samplesizeExample example);

    int updateByExample(@Param("record") Tab_samplesize record, @Param("example") Tab_samplesizeExample example);

    int updateByPrimaryKeySelective(Tab_samplesize record);

    int updateByPrimaryKey(Tab_samplesize record);
}