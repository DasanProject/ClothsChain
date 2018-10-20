package com.example.demo.biz;

import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


public interface CmyBiz {
    //查询颜色库
    public PageInfo<Tab_color> getColors_cmy(Tab_color color,PageEntity pageEntity);
    //查询尺寸表
    public List<Tab_size> getSize_cmy();
    //查新品牌表
    public List<Tab_brand> getBrand_cmy(Integer customerid);
    //查询版型表
     public List<Tab_sampletype> getSampletype_cmy();
    //查询季度表
    public List<Tab_quarterly> getQuarterly_cmy();
    //查询款式表
    public List<Tab_stylelibrary> getStylelibrary_cmy(Integer customer);
    //陈梦月分页查询所有
    public PageInfo<Map> getAlladmission_cmy(PageEntity pageEntity);
    //客户管理
    public List<Map> getCustomer_cmy();
    //根据类型id查询出单号信息。返回给controller一个字符串单号。(按照mapper文件中自动生成的方法)
    public String selectByPrimaryKey(int typeid);
    //分页查询样衣明细
    public PageInfo<Map> getAllSampleListByPage_cmy(PageEntity pageEntity,Tab_samplelist samplelist);
}
