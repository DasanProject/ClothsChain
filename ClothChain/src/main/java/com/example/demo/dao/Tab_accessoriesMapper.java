package com.example.demo.dao;

import com.example.demo.entity.Tab_accessories;
import com.example.demo.entity.Tab_accessoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_accessoriesMapper {
    int countByExample(Tab_accessoriesExample example);

    int deleteByExample(Tab_accessoriesExample example);

    int deleteByPrimaryKey(Integer accessoriesid);

    int insert(Tab_accessories record);

    int insertSelective(Tab_accessories record);

    List<Tab_accessories> selectByExample(Tab_accessoriesExample example);

    Tab_accessories selectByPrimaryKey(Integer accessoriesid);

    int updateByExampleSelective(@Param("record") Tab_accessories record, @Param("example") Tab_accessoriesExample example);

    int updateByExample(@Param("record") Tab_accessories record, @Param("example") Tab_accessoriesExample example);

    int updateByPrimaryKeySelective(Tab_accessories record);

    int updateByPrimaryKey(Tab_accessories record);
}