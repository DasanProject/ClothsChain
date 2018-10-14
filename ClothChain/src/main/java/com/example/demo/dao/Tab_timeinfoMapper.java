package com.example.demo.dao;

import com.example.demo.entity.Tab_timeinfo;
import com.example.demo.entity.Tab_timeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_timeinfoMapper {
    int countByExample(Tab_timeinfoExample example);

    int deleteByExample(Tab_timeinfoExample example);

    int deleteByPrimaryKey(Integer timeid);

    int insert(Tab_timeinfo record);

    int insertSelective(Tab_timeinfo record);

    List<Tab_timeinfo> selectByExample(Tab_timeinfoExample example);

    Tab_timeinfo selectByPrimaryKey(Integer timeid);

    int updateByExampleSelective(@Param("record") Tab_timeinfo record, @Param("example") Tab_timeinfoExample example);

    int updateByExample(@Param("record") Tab_timeinfo record, @Param("example") Tab_timeinfoExample example);

    int updateByPrimaryKeySelective(Tab_timeinfo record);

    int updateByPrimaryKey(Tab_timeinfo record);
}