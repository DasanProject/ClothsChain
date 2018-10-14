package com.example.demo.dao;

import com.example.demo.entity.Tab_user;
import com.example.demo.entity.Tab_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_userMapper {
    int countByExample(Tab_userExample example);

    int deleteByExample(Tab_userExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Tab_user record);

    int insertSelective(Tab_user record);

    List<Tab_user> selectByExample(Tab_userExample example);

    Tab_user selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Tab_user record, @Param("example") Tab_userExample example);

    int updateByExample(@Param("record") Tab_user record, @Param("example") Tab_userExample example);

    int updateByPrimaryKeySelective(Tab_user record);

    int updateByPrimaryKey(Tab_user record);
}