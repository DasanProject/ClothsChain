package com.example.demo.dao;

import com.example.demo.entity.Tab_customer;
import com.example.demo.entity.Tab_customerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Tab_customerMapper {
    int countByExample(Tab_customerExample example);

    int deleteByExample(Tab_customerExample example);

    int deleteByPrimaryKey(Integer customerid);

    int insert(Tab_customer record);

    int insertSelective(Tab_customer record);

    List<Tab_customer> selectByExample(Tab_customerExample example);

    Tab_customer selectByPrimaryKey(Integer customerid);

    int updateByExampleSelective(@Param("record") Tab_customer record, @Param("example") Tab_customerExample example);

    int updateByExample(@Param("record") Tab_customer record, @Param("example") Tab_customerExample example);

    int updateByPrimaryKeySelective(Tab_customer record);

    int updateByPrimaryKey(Tab_customer record);
}