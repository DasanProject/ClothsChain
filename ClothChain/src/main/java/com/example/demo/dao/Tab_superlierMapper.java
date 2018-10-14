package com.example.demo.dao;

import com.example.demo.entity.Tab_superlier;
import com.example.demo.entity.Tab_superlierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_superlierMapper {
    int countByExample(Tab_superlierExample example);

    int deleteByExample(Tab_superlierExample example);

    int deleteByPrimaryKey(Integer superlierid);

    int insert(Tab_superlier record);

    int insertSelective(Tab_superlier record);

    List<Tab_superlier> selectByExample(Tab_superlierExample example);

    Tab_superlier selectByPrimaryKey(Integer superlierid);

    int updateByExampleSelective(@Param("record") Tab_superlier record, @Param("example") Tab_superlierExample example);

    int updateByExample(@Param("record") Tab_superlier record, @Param("example") Tab_superlierExample example);

    int updateByPrimaryKeySelective(Tab_superlier record);

    int updateByPrimaryKey(Tab_superlier record);
}