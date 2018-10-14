package com.example.demo.dao;

import com.example.demo.entity.Tab_purchase;
import com.example.demo.entity.Tab_purchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_purchaseMapper {
    int countByExample(Tab_purchaseExample example);

    int deleteByExample(Tab_purchaseExample example);

    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Tab_purchase record);

    int insertSelective(Tab_purchase record);

    List<Tab_purchase> selectByExample(Tab_purchaseExample example);

    Tab_purchase selectByPrimaryKey(Integer purchaseid);

    int updateByExampleSelective(@Param("record") Tab_purchase record, @Param("example") Tab_purchaseExample example);

    int updateByExample(@Param("record") Tab_purchase record, @Param("example") Tab_purchaseExample example);

    int updateByPrimaryKeySelective(Tab_purchase record);

    int updateByPrimaryKey(Tab_purchase record);
}