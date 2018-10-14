package com.example.demo.dao;

import com.example.demo.entity.Tab_size;
import com.example.demo.entity.Tab_sizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_sizeMapper {
    int countByExample(Tab_sizeExample example);

    int deleteByExample(Tab_sizeExample example);

    int deleteByPrimaryKey(Integer sizeid);

    int insert(Tab_size record);

    int insertSelective(Tab_size record);

    List<Tab_size> selectByExample(Tab_sizeExample example);

    Tab_size selectByPrimaryKey(Integer sizeid);

    int updateByExampleSelective(@Param("record") Tab_size record, @Param("example") Tab_sizeExample example);

    int updateByExample(@Param("record") Tab_size record, @Param("example") Tab_sizeExample example);

    int updateByPrimaryKeySelective(Tab_size record);

    int updateByPrimaryKey(Tab_size record);
}