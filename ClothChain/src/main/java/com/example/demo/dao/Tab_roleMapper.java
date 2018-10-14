package com.example.demo.dao;

import com.example.demo.entity.Tab_role;
import com.example.demo.entity.Tab_roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_roleMapper {
    int countByExample(Tab_roleExample example);

    int deleteByExample(Tab_roleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Tab_role record);

    int insertSelective(Tab_role record);

    List<Tab_role> selectByExample(Tab_roleExample example);

    Tab_role selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Tab_role record, @Param("example") Tab_roleExample example);

    int updateByExample(@Param("record") Tab_role record, @Param("example") Tab_roleExample example);

    int updateByPrimaryKeySelective(Tab_role record);

    int updateByPrimaryKey(Tab_role record);
}