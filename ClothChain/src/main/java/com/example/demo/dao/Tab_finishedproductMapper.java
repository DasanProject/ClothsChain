package com.example.demo.dao;

import com.example.demo.entity.Tab_finishedproduct;
import com.example.demo.entity.Tab_finishedproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_finishedproductMapper {
    int countByExample(Tab_finishedproductExample example);

    int deleteByExample(Tab_finishedproductExample example);

    int deleteByPrimaryKey(Integer inid);

    int insert(Tab_finishedproduct record);

    int insertSelective(Tab_finishedproduct record);

    List<Tab_finishedproduct> selectByExample(Tab_finishedproductExample example);

    Tab_finishedproduct selectByPrimaryKey(Integer inid);

    int updateByExampleSelective(@Param("record") Tab_finishedproduct record, @Param("example") Tab_finishedproductExample example);

    int updateByExample(@Param("record") Tab_finishedproduct record, @Param("example") Tab_finishedproductExample example);

    int updateByPrimaryKeySelective(Tab_finishedproduct record);

    int updateByPrimaryKey(Tab_finishedproduct record);
}