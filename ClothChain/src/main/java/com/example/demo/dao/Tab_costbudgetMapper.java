package com.example.demo.dao;

import com.example.demo.entity.Tab_costbudget;
import com.example.demo.entity.Tab_costbudgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_costbudgetMapper {
    int countByExample(Tab_costbudgetExample example);

    int deleteByExample(Tab_costbudgetExample example);

    int deleteByPrimaryKey(Integer costbudgetid);

    int insert(Tab_costbudget record);

    int insertSelective(Tab_costbudget record);

    List<Tab_costbudget> selectByExample(Tab_costbudgetExample example);

    Tab_costbudget selectByPrimaryKey(Integer costbudgetid);

    int updateByExampleSelective(@Param("record") Tab_costbudget record, @Param("example") Tab_costbudgetExample example);

    int updateByExample(@Param("record") Tab_costbudget record, @Param("example") Tab_costbudgetExample example);

    int updateByPrimaryKeySelective(Tab_costbudget record);

    int updateByPrimaryKey(Tab_costbudget record);
}