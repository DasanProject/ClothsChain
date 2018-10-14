package com.example.demo.dao;

import com.example.demo.entity.Tab_shipno;
import com.example.demo.entity.Tab_shipnoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_shipnoMapper {
    int countByExample(Tab_shipnoExample example);

    int deleteByExample(Tab_shipnoExample example);

    int deleteByPrimaryKey(Integer spid);

    int insert(Tab_shipno record);

    int insertSelective(Tab_shipno record);

    List<Tab_shipno> selectByExample(Tab_shipnoExample example);

    Tab_shipno selectByPrimaryKey(Integer spid);

    int updateByExampleSelective(@Param("record") Tab_shipno record, @Param("example") Tab_shipnoExample example);

    int updateByExample(@Param("record") Tab_shipno record, @Param("example") Tab_shipnoExample example);

    int updateByPrimaryKeySelective(Tab_shipno record);

    int updateByPrimaryKey(Tab_shipno record);
}