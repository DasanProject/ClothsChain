package com.example.demo.dao;

import com.example.demo.entity.Tab_stylelibrary;
import com.example.demo.entity.Tab_stylelibraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_stylelibraryMapper {
    int countByExample(Tab_stylelibraryExample example);

    int deleteByExample(Tab_stylelibraryExample example);

    int deleteByPrimaryKey(Integer styleid);

    int insert(Tab_stylelibrary record);

    int insertSelective(Tab_stylelibrary record);

    List<Tab_stylelibrary> selectByExample(Tab_stylelibraryExample example);

    Tab_stylelibrary selectByPrimaryKey(Integer styleid);

    int updateByExampleSelective(@Param("record") Tab_stylelibrary record, @Param("example") Tab_stylelibraryExample example);

    int updateByExample(@Param("record") Tab_stylelibrary record, @Param("example") Tab_stylelibraryExample example);

    int updateByPrimaryKeySelective(Tab_stylelibrary record);

    int updateByPrimaryKey(Tab_stylelibrary record);
}