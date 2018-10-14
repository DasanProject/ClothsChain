package com.example.demo.dao;

import com.example.demo.entity.Tab_finecode;
import com.example.demo.entity.Tab_finecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_finecodeMapper {
    int countByExample(Tab_finecodeExample example);

    int deleteByExample(Tab_finecodeExample example);

    int deleteByPrimaryKey(Integer fincodeid);

    int insert(Tab_finecode record);

    int insertSelective(Tab_finecode record);

    List<Tab_finecode> selectByExample(Tab_finecodeExample example);

    Tab_finecode selectByPrimaryKey(Integer fincodeid);

    int updateByExampleSelective(@Param("record") Tab_finecode record, @Param("example") Tab_finecodeExample example);

    int updateByExample(@Param("record") Tab_finecode record, @Param("example") Tab_finecodeExample example);

    int updateByPrimaryKeySelective(Tab_finecode record);

    int updateByPrimaryKey(Tab_finecode record);
}