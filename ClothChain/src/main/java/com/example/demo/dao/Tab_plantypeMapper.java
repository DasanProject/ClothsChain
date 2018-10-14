package com.example.demo.dao;

import com.example.demo.entity.Tab_plantype;
import com.example.demo.entity.Tab_plantypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_plantypeMapper {
    int countByExample(Tab_plantypeExample example);

    int deleteByExample(Tab_plantypeExample example);

    int deleteByPrimaryKey(Integer plantypeid);

    int insert(Tab_plantype record);

    int insertSelective(Tab_plantype record);

    List<Tab_plantype> selectByExample(Tab_plantypeExample example);

    Tab_plantype selectByPrimaryKey(Integer plantypeid);

    int updateByExampleSelective(@Param("record") Tab_plantype record, @Param("example") Tab_plantypeExample example);

    int updateByExample(@Param("record") Tab_plantype record, @Param("example") Tab_plantypeExample example);

    int updateByPrimaryKeySelective(Tab_plantype record);

    int updateByPrimaryKey(Tab_plantype record);
}