package com.example.demo.dao;

import com.example.demo.entity.Tab_planremark;
import com.example.demo.entity.Tab_planremarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_planremarkMapper {
    int countByExample(Tab_planremarkExample example);

    int deleteByExample(Tab_planremarkExample example);

    int deleteByPrimaryKey(Integer planremarkid);

    int insert(Tab_planremark record);

    int insertSelective(Tab_planremark record);

    List<Tab_planremark> selectByExample(Tab_planremarkExample example);

    Tab_planremark selectByPrimaryKey(Integer planremarkid);

    int updateByExampleSelective(@Param("record") Tab_planremark record, @Param("example") Tab_planremarkExample example);

    int updateByExample(@Param("record") Tab_planremark record, @Param("example") Tab_planremarkExample example);

    int updateByPrimaryKeySelective(Tab_planremark record);

    int updateByPrimaryKey(Tab_planremark record);
}