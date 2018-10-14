package com.example.demo.dao;

import com.example.demo.entity.Tab_deliveryrecord;
import com.example.demo.entity.Tab_deliveryrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_deliveryrecordMapper {
    int countByExample(Tab_deliveryrecordExample example);

    int deleteByExample(Tab_deliveryrecordExample example);

    int deleteByPrimaryKey(Integer deliveryid);

    int insert(Tab_deliveryrecord record);

    int insertSelective(Tab_deliveryrecord record);

    List<Tab_deliveryrecord> selectByExample(Tab_deliveryrecordExample example);

    Tab_deliveryrecord selectByPrimaryKey(Integer deliveryid);

    int updateByExampleSelective(@Param("record") Tab_deliveryrecord record, @Param("example") Tab_deliveryrecordExample example);

    int updateByExample(@Param("record") Tab_deliveryrecord record, @Param("example") Tab_deliveryrecordExample example);

    int updateByPrimaryKeySelective(Tab_deliveryrecord record);

    int updateByPrimaryKey(Tab_deliveryrecord record);
}