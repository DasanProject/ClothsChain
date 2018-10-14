package com.example.demo.dao;

import com.example.demo.entity.Tab_picking;
import com.example.demo.entity.Tab_pickingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_pickingMapper {
    int countByExample(Tab_pickingExample example);

    int deleteByExample(Tab_pickingExample example);

    int deleteByPrimaryKey(Integer pickinid);

    int insert(Tab_picking record);

    int insertSelective(Tab_picking record);

    List<Tab_picking> selectByExample(Tab_pickingExample example);

    Tab_picking selectByPrimaryKey(Integer pickinid);

    int updateByExampleSelective(@Param("record") Tab_picking record, @Param("example") Tab_pickingExample example);

    int updateByExample(@Param("record") Tab_picking record, @Param("example") Tab_pickingExample example);

    int updateByPrimaryKeySelective(Tab_picking record);

    int updateByPrimaryKey(Tab_picking record);
}