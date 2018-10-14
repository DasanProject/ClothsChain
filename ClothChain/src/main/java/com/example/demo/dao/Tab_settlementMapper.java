package com.example.demo.dao;

import com.example.demo.entity.Tab_settlement;
import com.example.demo.entity.Tab_settlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_settlementMapper {
    int countByExample(Tab_settlementExample example);

    int deleteByExample(Tab_settlementExample example);

    int deleteByPrimaryKey(Integer settlementid);

    int insert(Tab_settlement record);

    int insertSelective(Tab_settlement record);

    List<Tab_settlement> selectByExample(Tab_settlementExample example);

    Tab_settlement selectByPrimaryKey(Integer settlementid);

    int updateByExampleSelective(@Param("record") Tab_settlement record, @Param("example") Tab_settlementExample example);

    int updateByExample(@Param("record") Tab_settlement record, @Param("example") Tab_settlementExample example);

    int updateByPrimaryKeySelective(Tab_settlement record);

    int updateByPrimaryKey(Tab_settlement record);
}