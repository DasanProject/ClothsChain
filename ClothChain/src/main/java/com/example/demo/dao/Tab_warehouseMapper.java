package com.example.demo.dao;

import com.example.demo.entity.Tab_warehouse;
import com.example.demo.entity.Tab_warehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_warehouseMapper {
    int countByExample(Tab_warehouseExample example);

    int deleteByExample(Tab_warehouseExample example);

    int deleteByPrimaryKey(Integer warehouseid);

    int insert(Tab_warehouse record);

    int insertSelective(Tab_warehouse record);

    List<Tab_warehouse> selectByExample(Tab_warehouseExample example);

    Tab_warehouse selectByPrimaryKey(Integer warehouseid);

    int updateByExampleSelective(@Param("record") Tab_warehouse record, @Param("example") Tab_warehouseExample example);

    int updateByExample(@Param("record") Tab_warehouse record, @Param("example") Tab_warehouseExample example);

    int updateByPrimaryKeySelective(Tab_warehouse record);

    int updateByPrimaryKey(Tab_warehouse record);
}