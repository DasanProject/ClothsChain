package com.example.demo.dao;

import com.example.demo.entity.Tab_otherplan;
import com.example.demo.entity.Tab_otherplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_otherplanMapper {
    int countByExample(Tab_otherplanExample example);

    int deleteByExample(Tab_otherplanExample example);

    int deleteByPrimaryKey(Integer otherplanid);

    int insert(Tab_otherplan record);

    int insertSelective(Tab_otherplan record);

    List<Tab_otherplan> selectByExample(Tab_otherplanExample example);

    Tab_otherplan selectByPrimaryKey(Integer otherplanid);

    int updateByExampleSelective(@Param("record") Tab_otherplan record, @Param("example") Tab_otherplanExample example);

    int updateByExample(@Param("record") Tab_otherplan record, @Param("example") Tab_otherplanExample example);

    int updateByPrimaryKeySelective(Tab_otherplan record);

    int updateByPrimaryKey(Tab_otherplan record);
}