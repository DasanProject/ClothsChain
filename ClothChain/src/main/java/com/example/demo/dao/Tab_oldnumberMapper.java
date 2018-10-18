package com.example.demo.dao;

import com.example.demo.entity.Tab_oldnumber;
import com.example.demo.entity.Tab_oldnumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_oldnumberMapper {
    int countByExample(Tab_oldnumberExample example);

    int deleteByExample(Tab_oldnumberExample example);

    int deleteByPrimaryKey(Integer oldnumber);

    int insert(Tab_oldnumber record);

    int insertSelective(Tab_oldnumber record);

    List<Tab_oldnumber> selectByExample(Tab_oldnumberExample example);

    Tab_oldnumber selectByPrimaryKey(Integer oldnumber);

    int updateByExampleSelective(@Param("record") Tab_oldnumber record, @Param("example") Tab_oldnumberExample example);

    int updateByExample(@Param("record") Tab_oldnumber record, @Param("example") Tab_oldnumberExample example);

    int updateByPrimaryKeySelective(Tab_oldnumber record);

    int updateByPrimaryKey(Tab_oldnumber record);

}