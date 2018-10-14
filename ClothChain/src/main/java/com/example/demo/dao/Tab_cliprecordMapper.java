package com.example.demo.dao;

import com.example.demo.entity.Tab_cliprecord;
import com.example.demo.entity.Tab_cliprecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_cliprecordMapper {
    int countByExample(Tab_cliprecordExample example);

    int deleteByExample(Tab_cliprecordExample example);

    int deleteByPrimaryKey(Integer cliprecordid);

    int insert(Tab_cliprecord record);

    int insertSelective(Tab_cliprecord record);

    List<Tab_cliprecord> selectByExample(Tab_cliprecordExample example);

    Tab_cliprecord selectByPrimaryKey(Integer cliprecordid);

    int updateByExampleSelective(@Param("record") Tab_cliprecord record, @Param("example") Tab_cliprecordExample example);

    int updateByExample(@Param("record") Tab_cliprecord record, @Param("example") Tab_cliprecordExample example);

    int updateByPrimaryKeySelective(Tab_cliprecord record);

    int updateByPrimaryKey(Tab_cliprecord record);
}