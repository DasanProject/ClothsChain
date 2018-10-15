package com.example.demo.dao;

import com.example.demo.entity.Tab_planmatter;
import com.example.demo.entity.Tab_planmatterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_planmatterMapper {
    int countByExample(Tab_planmatterExample example);

    int deleteByExample(Tab_planmatterExample example);

    int deleteByPrimaryKey(Integer planmatterid);

    int insert(Tab_planmatter record);

    int insertSelective(Tab_planmatter record);

    List<Tab_planmatter> selectByExample(Tab_planmatterExample example);

    Tab_planmatter selectByPrimaryKey(Integer planmatterid);

    int updateByExampleSelective(@Param("record") Tab_planmatter record, @Param("example") Tab_planmatterExample example);

    int updateByExample(@Param("record") Tab_planmatter record, @Param("example") Tab_planmatterExample example);

    int updateByPrimaryKeySelective(Tab_planmatter record);

    int updateByPrimaryKey(Tab_planmatter record);
}