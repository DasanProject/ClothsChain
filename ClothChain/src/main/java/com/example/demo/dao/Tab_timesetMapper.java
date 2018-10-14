package com.example.demo.dao;

import com.example.demo.entity.Tab_timeset;
import com.example.demo.entity.Tab_timesetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_timesetMapper {
    int countByExample(Tab_timesetExample example);

    int deleteByExample(Tab_timesetExample example);

    int deleteByPrimaryKey(Integer setid);

    int insert(Tab_timeset record);

    int insertSelective(Tab_timeset record);

    List<Tab_timeset> selectByExample(Tab_timesetExample example);

    Tab_timeset selectByPrimaryKey(Integer setid);

    int updateByExampleSelective(@Param("record") Tab_timeset record, @Param("example") Tab_timesetExample example);

    int updateByExample(@Param("record") Tab_timeset record, @Param("example") Tab_timesetExample example);

    int updateByPrimaryKeySelective(Tab_timeset record);

    int updateByPrimaryKey(Tab_timeset record);
}