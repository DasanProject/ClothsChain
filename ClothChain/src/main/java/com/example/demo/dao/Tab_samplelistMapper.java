package com.example.demo.dao;

import com.example.demo.entity.Tab_samplelist;
import com.example.demo.entity.Tab_samplelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_samplelistMapper {
    int countByExample(Tab_samplelistExample example);

    int deleteByExample(Tab_samplelistExample example);

    int deleteByPrimaryKey(Integer sampleid);

    int insert(Tab_samplelist record);

    int insertSelective(Tab_samplelist record);

    List<Tab_samplelist> selectByExample(Tab_samplelistExample example);

    Tab_samplelist selectByPrimaryKey(Integer sampleid);

    int updateByExampleSelective(@Param("record") Tab_samplelist record, @Param("example") Tab_samplelistExample example);

    int updateByExample(@Param("record") Tab_samplelist record, @Param("example") Tab_samplelistExample example);

    int updateByPrimaryKeySelective(Tab_samplelist record);

    int updateByPrimaryKey(Tab_samplelist record);
}