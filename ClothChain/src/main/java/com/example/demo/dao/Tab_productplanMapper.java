package com.example.demo.dao;

import com.example.demo.entity.Tab_productplan;
import com.example.demo.entity.Tab_productplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_productplanMapper {
    int countByExample(Tab_productplanExample example);

    int deleteByExample(Tab_productplanExample example);

    int deleteByPrimaryKey(Integer productplanid);

    int insert(Tab_productplan record);

    int insertSelective(Tab_productplan record);

    List<Tab_productplan> selectByExample(Tab_productplanExample example);

    Tab_productplan selectByPrimaryKey(Integer productplanid);

    int updateByExampleSelective(@Param("record") Tab_productplan record, @Param("example") Tab_productplanExample example);

    int updateByExample(@Param("record") Tab_productplan record, @Param("example") Tab_productplanExample example);

    int updateByPrimaryKeySelective(Tab_productplan record);

    int updateByPrimaryKey(Tab_productplan record);
}