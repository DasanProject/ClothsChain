package com.example.demo.dao;

import com.example.demo.entity.Tab_orderdetail;
import com.example.demo.entity.Tab_orderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_orderdetailMapper {
    int countByExample(Tab_orderdetailExample example);

    int deleteByExample(Tab_orderdetailExample example);

    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(Tab_orderdetail record);

    int insertSelective(Tab_orderdetail record);

    List<Tab_orderdetail> selectByExample(Tab_orderdetailExample example);

    Tab_orderdetail selectByPrimaryKey(Integer orderdetailid);

    int updateByExampleSelective(@Param("record") Tab_orderdetail record, @Param("example") Tab_orderdetailExample example);

    int updateByExample(@Param("record") Tab_orderdetail record, @Param("example") Tab_orderdetailExample example);

    int updateByPrimaryKeySelective(Tab_orderdetail record);

    int updateByPrimaryKey(Tab_orderdetail record);
}