package com.example.demo.dao;

import com.example.demo.entity.Tab_admission;
import com.example.demo.entity.Tab_admissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tab_admissionMapper {
    int countByExample(Tab_admissionExample example);

    int deleteByExample(Tab_admissionExample example);

    int deleteByPrimaryKey(Integer admissionid);

    int insert(Tab_admission record);

    int insertSelective(Tab_admission record);

    List<Tab_admission> selectByExample(Tab_admissionExample example);

    Tab_admission selectByPrimaryKey(Integer admissionid);

    int updateByExampleSelective(@Param("record") Tab_admission record, @Param("example") Tab_admissionExample example);

    int updateByExample(@Param("record") Tab_admission record, @Param("example") Tab_admissionExample example);

    int updateByPrimaryKeySelective(Tab_admission record);

    int updateByPrimaryKey(Tab_admission record);
}