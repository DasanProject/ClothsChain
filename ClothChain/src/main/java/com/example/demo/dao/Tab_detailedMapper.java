package com.example.demo.dao;

import com.example.demo.entity.Tab_detailed;
import com.example.demo.entity.Tab_detailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_detailedMapper {
    int countByExample(Tab_detailedExample example);

    int deleteByExample(Tab_detailedExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(Tab_detailed record);

    int insertSelective(Tab_detailed record);

    List<Tab_detailed> selectByExample(Tab_detailedExample example);

    Tab_detailed selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") Tab_detailed record, @Param("example") Tab_detailedExample example);

    int updateByExample(@Param("record") Tab_detailed record, @Param("example") Tab_detailedExample example);

    int updateByPrimaryKeySelective(Tab_detailed record);

    int updateByPrimaryKey(Tab_detailed record);
}