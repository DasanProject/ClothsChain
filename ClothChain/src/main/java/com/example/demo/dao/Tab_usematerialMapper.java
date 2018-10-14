package com.example.demo.dao;

import com.example.demo.entity.Tab_usematerial;
import com.example.demo.entity.Tab_usematerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_usematerialMapper {
    int countByExample(Tab_usematerialExample example);

    int deleteByExample(Tab_usematerialExample example);

    int deleteByPrimaryKey(Integer usematerialid);

    int insert(Tab_usematerial record);

    int insertSelective(Tab_usematerial record);

    List<Tab_usematerial> selectByExample(Tab_usematerialExample example);

    Tab_usematerial selectByPrimaryKey(Integer usematerialid);

    int updateByExampleSelective(@Param("record") Tab_usematerial record, @Param("example") Tab_usematerialExample example);

    int updateByExample(@Param("record") Tab_usematerial record, @Param("example") Tab_usematerialExample example);

    int updateByPrimaryKeySelective(Tab_usematerial record);

    int updateByPrimaryKey(Tab_usematerial record);
}