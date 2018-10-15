package com.example.demo.biz;

import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface Tab_admissoonBiz {
    //陈梦月分页查询所有
     public PageInfo<Map> getAlladmission_cmy(PageEntity pageEntity);
}
