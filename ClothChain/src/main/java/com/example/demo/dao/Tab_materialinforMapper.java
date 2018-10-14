package com.example.demo.dao;

import com.example.demo.entity.Tab_materialinfor;
import com.example.demo.entity.Tab_materialinforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_materialinforMapper {
    int countByExample(Tab_materialinforExample example);

    int deleteByExample(Tab_materialinforExample example);

    int deleteByPrimaryKey(Integer infoid);

    int insert(Tab_materialinfor record);

    int insertSelective(Tab_materialinfor record);

    List<Tab_materialinfor> selectByExample(Tab_materialinforExample example);

    Tab_materialinfor selectByPrimaryKey(Integer infoid);

    int updateByExampleSelective(@Param("record") Tab_materialinfor record, @Param("example") Tab_materialinforExample example);

    int updateByExample(@Param("record") Tab_materialinfor record, @Param("example") Tab_materialinforExample example);

    int updateByPrimaryKeySelective(Tab_materialinfor record);

    int updateByPrimaryKey(Tab_materialinfor record);
}