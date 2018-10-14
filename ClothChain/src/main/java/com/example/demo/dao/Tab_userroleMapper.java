package com.example.demo.dao;

import com.example.demo.entity.Tab_userrole;
import com.example.demo.entity.Tab_userroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_userroleMapper {
    int countByExample(Tab_userroleExample example);

    int deleteByExample(Tab_userroleExample example);

    int deleteByPrimaryKey(Integer roleuserid);

    int insert(Tab_userrole record);

    int insertSelective(Tab_userrole record);

    List<Tab_userrole> selectByExample(Tab_userroleExample example);

    Tab_userrole selectByPrimaryKey(Integer roleuserid);

    int updateByExampleSelective(@Param("record") Tab_userrole record, @Param("example") Tab_userroleExample example);

    int updateByExample(@Param("record") Tab_userrole record, @Param("example") Tab_userroleExample example);

    int updateByPrimaryKeySelective(Tab_userrole record);

    int updateByPrimaryKey(Tab_userrole record);
}