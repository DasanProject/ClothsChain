package com.example.demo.dao;

import com.example.demo.entity.Tab_material;
import com.example.demo.entity.Tab_materialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_materialMapper {
    int countByExample(Tab_materialExample example);

    int deleteByExample(Tab_materialExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Tab_material record);

    int insertSelective(Tab_material record);

    List<Tab_material> selectByExample(Tab_materialExample example);

    Tab_material selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Tab_material record, @Param("example") Tab_materialExample example);

    int updateByExample(@Param("record") Tab_material record, @Param("example") Tab_materialExample example);

    int updateByPrimaryKeySelective(Tab_material record);

    int updateByPrimaryKey(Tab_material record);
}