package com.example.demo.dao;

import com.example.demo.entity.Tab_sizetemplate;
import com.example.demo.entity.Tab_sizetemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_sizetemplateMapper {
    int countByExample(Tab_sizetemplateExample example);

    int deleteByExample(Tab_sizetemplateExample example);

    int deleteByPrimaryKey(Integer sizeid);

    int insert(Tab_sizetemplate record);

    int insertSelective(Tab_sizetemplate record);

    List<Tab_sizetemplate> selectByExample(Tab_sizetemplateExample example);

    Tab_sizetemplate selectByPrimaryKey(Integer sizeid);

    int updateByExampleSelective(@Param("record") Tab_sizetemplate record, @Param("example") Tab_sizetemplateExample example);

    int updateByExample(@Param("record") Tab_sizetemplate record, @Param("example") Tab_sizetemplateExample example);

    int updateByPrimaryKeySelective(Tab_sizetemplate record);

    int updateByPrimaryKey(Tab_sizetemplate record);
}