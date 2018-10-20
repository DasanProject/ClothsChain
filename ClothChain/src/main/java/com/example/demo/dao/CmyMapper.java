package com.example.demo.dao;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CmyMapper {
    //查询颜色库
    public List<Tab_color> getColors_cmy(Tab_color color);
    //查询尺寸表
    public List<Tab_size> getSize_cmy();
    //查询品牌表
    public List<Tab_brand> getBrand_cmy(@Param("customerid") Integer customerid);
    //查询版型表
    public List<Tab_sampletype> getSampletype_cmy();
    //查询季度表
    public List<Tab_quarterly> getQuarterly_cmy();
    //查询款式表
    public List<Tab_stylelibrary> getStylelibrary_cmy(@Param("customer") Integer customer);
    //客户单号
    public List<Map> getCustomer_cmy();
    //陈梦月分页查询
    public List<Map> getAlladmission_cmy();
    //查询样衣明细
    public  List<Map> getAllSampleListByPage_cmy(Tab_samplelist samplelist);
}
