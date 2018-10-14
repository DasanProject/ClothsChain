package com.example.demo.dao;

import com.example.demo.entity.Tab_storage;
import com.example.demo.entity.Tab_storageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_storageMapper {
    int countByExample(Tab_storageExample example);

    int deleteByExample(Tab_storageExample example);

    int deleteByPrimaryKey(Integer storageid);

    int insert(Tab_storage record);

    int insertSelective(Tab_storage record);

    List<Tab_storage> selectByExample(Tab_storageExample example);

    Tab_storage selectByPrimaryKey(Integer storageid);

    int updateByExampleSelective(@Param("record") Tab_storage record, @Param("example") Tab_storageExample example);

    int updateByExample(@Param("record") Tab_storage record, @Param("example") Tab_storageExample example);

    int updateByPrimaryKeySelective(Tab_storage record);

    int updateByPrimaryKey(Tab_storage record);
}