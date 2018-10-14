package com.example.demo.dao;

import com.example.demo.entity.Tab_badproblem;
import com.example.demo.entity.Tab_badproblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_badproblemMapper {
    int countByExample(Tab_badproblemExample example);

    int deleteByExample(Tab_badproblemExample example);

    int deleteByPrimaryKey(Integer typeinid);

    int insert(Tab_badproblem record);

    int insertSelective(Tab_badproblem record);

    List<Tab_badproblem> selectByExample(Tab_badproblemExample example);

    Tab_badproblem selectByPrimaryKey(Integer typeinid);

    int updateByExampleSelective(@Param("record") Tab_badproblem record, @Param("example") Tab_badproblemExample example);

    int updateByExample(@Param("record") Tab_badproblem record, @Param("example") Tab_badproblemExample example);

    int updateByPrimaryKeySelective(Tab_badproblem record);

    int updateByPrimaryKey(Tab_badproblem record);
}