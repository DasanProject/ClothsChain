package com.example.demo.dao;

import com.example.demo.entity.Tab_procurentplan;
import com.example.demo.entity.Tab_procurentplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_procurentplanMapper {
    int countByExample(Tab_procurentplanExample example);

    int deleteByExample(Tab_procurentplanExample example);

    int deleteByPrimaryKey(Integer procurentid);

    int insert(Tab_procurentplan record);

    int insertSelective(Tab_procurentplan record);

    List<Tab_procurentplan> selectByExample(Tab_procurentplanExample example);

    Tab_procurentplan selectByPrimaryKey(Integer procurentid);

    int updateByExampleSelective(@Param("record") Tab_procurentplan record, @Param("example") Tab_procurentplanExample example);

    int updateByExample(@Param("record") Tab_procurentplan record, @Param("example") Tab_procurentplanExample example);

    int updateByPrimaryKeySelective(Tab_procurentplan record);

    int updateByPrimaryKey(Tab_procurentplan record);
}