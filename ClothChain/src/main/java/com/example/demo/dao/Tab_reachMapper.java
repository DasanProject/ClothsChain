package com.example.demo.dao;

import com.example.demo.entity.Tab_reach;
import com.example.demo.entity.Tab_reachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_reachMapper {
    int countByExample(Tab_reachExample example);

    int deleteByExample(Tab_reachExample example);

    int deleteByPrimaryKey(Integer reachid);

    int insert(Tab_reach record);

    int insertSelective(Tab_reach record);

    List<Tab_reach> selectByExample(Tab_reachExample example);

    Tab_reach selectByPrimaryKey(Integer reachid);

    int updateByExampleSelective(@Param("record") Tab_reach record, @Param("example") Tab_reachExample example);

    int updateByExample(@Param("record") Tab_reach record, @Param("example") Tab_reachExample example);

    int updateByPrimaryKeySelective(Tab_reach record);

    int updateByPrimaryKey(Tab_reach record);
}