package com.example.demo.dao;

import com.example.demo.entity.Tab_pro;
import com.example.demo.entity.Tab_proExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_proMapper {
    int countByExample(Tab_proExample example);

    int deleteByExample(Tab_proExample example);

    int deleteByPrimaryKey(Integer progressid);

    int insert(Tab_pro record);

    int insertSelective(Tab_pro record);

    List<Tab_pro> selectByExample(Tab_proExample example);

    Tab_pro selectByPrimaryKey(Integer progressid);

    int updateByExampleSelective(@Param("record") Tab_pro record, @Param("example") Tab_proExample example);

    int updateByExample(@Param("record") Tab_pro record, @Param("example") Tab_proExample example);

    int updateByPrimaryKeySelective(Tab_pro record);

    int updateByPrimaryKey(Tab_pro record);
}