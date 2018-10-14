package com.example.demo.dao;

import com.example.demo.entity.Tab_chekorderdetail;
import com.example.demo.entity.Tab_chekorderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_chekorderdetailMapper {
    int countByExample(Tab_chekorderdetailExample example);

    int deleteByExample(Tab_chekorderdetailExample example);

    int deleteByPrimaryKey(Integer ordercheckid);

    int insert(Tab_chekorderdetail record);

    int insertSelective(Tab_chekorderdetail record);

    List<Tab_chekorderdetail> selectByExample(Tab_chekorderdetailExample example);

    Tab_chekorderdetail selectByPrimaryKey(Integer ordercheckid);

    int updateByExampleSelective(@Param("record") Tab_chekorderdetail record, @Param("example") Tab_chekorderdetailExample example);

    int updateByExample(@Param("record") Tab_chekorderdetail record, @Param("example") Tab_chekorderdetailExample example);

    int updateByPrimaryKeySelective(Tab_chekorderdetail record);

    int updateByPrimaryKey(Tab_chekorderdetail record);
}