package com.example.demo.dao;

import com.example.demo.entity.Tab_colormatch;
import com.example.demo.entity.Tab_colormatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_colormatchMapper {
    int countByExample(Tab_colormatchExample example);

    int deleteByExample(Tab_colormatchExample example);

    int deleteByPrimaryKey(Integer colormatchid);

    int insert(Tab_colormatch record);

    int insertSelective(Tab_colormatch record);

    List<Tab_colormatch> selectByExample(Tab_colormatchExample example);

    Tab_colormatch selectByPrimaryKey(Integer colormatchid);

    int updateByExampleSelective(@Param("record") Tab_colormatch record, @Param("example") Tab_colormatchExample example);

    int updateByExample(@Param("record") Tab_colormatch record, @Param("example") Tab_colormatchExample example);

    int updateByPrimaryKeySelective(Tab_colormatch record);

    int updateByPrimaryKey(Tab_colormatch record);
}