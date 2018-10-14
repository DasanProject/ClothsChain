package com.example.demo.dao;

import com.example.demo.entity.Tab_quarterly;
import com.example.demo.entity.Tab_quarterlyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_quarterlyMapper {
    int countByExample(Tab_quarterlyExample example);

    int deleteByExample(Tab_quarterlyExample example);

    int deleteByPrimaryKey(Integer quarterlyid);

    int insert(Tab_quarterly record);

    int insertSelective(Tab_quarterly record);

    List<Tab_quarterly> selectByExample(Tab_quarterlyExample example);

    Tab_quarterly selectByPrimaryKey(Integer quarterlyid);

    int updateByExampleSelective(@Param("record") Tab_quarterly record, @Param("example") Tab_quarterlyExample example);

    int updateByExample(@Param("record") Tab_quarterly record, @Param("example") Tab_quarterlyExample example);

    int updateByPrimaryKeySelective(Tab_quarterly record);

    int updateByPrimaryKey(Tab_quarterly record);
}