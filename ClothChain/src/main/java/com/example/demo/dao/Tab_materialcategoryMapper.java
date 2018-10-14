package com.example.demo.dao;

import com.example.demo.entity.Tab_materialcategory;
import com.example.demo.entity.Tab_materialcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_materialcategoryMapper {
    int countByExample(Tab_materialcategoryExample example);

    int deleteByExample(Tab_materialcategoryExample example);

    int deleteByPrimaryKey(Integer categoryid);

    int insert(Tab_materialcategory record);

    int insertSelective(Tab_materialcategory record);

    List<Tab_materialcategory> selectByExample(Tab_materialcategoryExample example);

    Tab_materialcategory selectByPrimaryKey(Integer categoryid);

    int updateByExampleSelective(@Param("record") Tab_materialcategory record, @Param("example") Tab_materialcategoryExample example);

    int updateByExample(@Param("record") Tab_materialcategory record, @Param("example") Tab_materialcategoryExample example);

    int updateByPrimaryKeySelective(Tab_materialcategory record);

    int updateByPrimaryKey(Tab_materialcategory record);
}