package com.example.demo.dao;

import com.example.demo.entity.Tab_brand;
import com.example.demo.entity.Tab_brandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_brandMapper {
    int countByExample(Tab_brandExample example);

    int deleteByExample(Tab_brandExample example);

    int deleteByPrimaryKey(Integer brandid);

    int insert(Tab_brand record);

    int insertSelective(Tab_brand record);

    List<Tab_brand> selectByExample(Tab_brandExample example);

    Tab_brand selectByPrimaryKey(Integer brandid);

    int updateByExampleSelective(@Param("record") Tab_brand record, @Param("example") Tab_brandExample example);

    int updateByExample(@Param("record") Tab_brand record, @Param("example") Tab_brandExample example);

    int updateByPrimaryKeySelective(Tab_brand record);

    int updateByPrimaryKey(Tab_brand record);
}