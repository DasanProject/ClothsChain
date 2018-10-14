package com.example.demo.dao;

import com.example.demo.entity.Tab_orderinfo;
import com.example.demo.entity.Tab_orderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_orderinfoMapper {
    int countByExample(Tab_orderinfoExample example);

    int deleteByExample(Tab_orderinfoExample example);

    int deleteByPrimaryKey(Integer orderinfoid);

    int insert(Tab_orderinfo record);

    int insertSelective(Tab_orderinfo record);

    List<Tab_orderinfo> selectByExample(Tab_orderinfoExample example);

    Tab_orderinfo selectByPrimaryKey(Integer orderinfoid);

    int updateByExampleSelective(@Param("record") Tab_orderinfo record, @Param("example") Tab_orderinfoExample example);

    int updateByExample(@Param("record") Tab_orderinfo record, @Param("example") Tab_orderinfoExample example);

    int updateByPrimaryKeySelective(Tab_orderinfo record);

    int updateByPrimaryKey(Tab_orderinfo record);
}