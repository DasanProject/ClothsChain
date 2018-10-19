package com.example.demo.controller;

import com.example.demo.biz.CmyBiz;
import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cmy")
public class CmyController {
    @Resource
    private CmyBiz biz;
//查询尺寸表
    @RequestMapping("/getSize_cmy")
    @ResponseBody
    public  List<Tab_size> getSize_cmy(){
        return biz.getSize_cmy();
    }
//查询品牌表
    @RequestMapping("/getBrand_cmy")
    @ResponseBody
    public List<Tab_brand> getBrand_cmy(Integer customeraaa){
        return biz.getBrand_cmy(customeraaa);
    }

    //查询款式表
    @RequestMapping("getStylelibrary_cmy")
    @ResponseBody
    public List<Tab_stylelibrary> getStylelibrary_cmy(){
        return biz.getStylelibrary_cmy();
    }
    //查询季度表
    @RequestMapping("getQuarterly_cmy")
    @ResponseBody
    public List<Tab_quarterly> getQuarterly_cmy(){
        return biz.getQuarterly_cmy();
    }
    //查询版型表
    @RequestMapping("getSampletype_cmy")
    @ResponseBody
    public List<Tab_sampletype> getSampletype_cmy(){
        return biz.getSampletype_cmy();
    }

//查询客户表
    @RequestMapping("/getCustomer_cmy")
    @ResponseBody
    public List<Map> getCustomer_cmy(){
        return biz.getCustomer_cmy();
    }
//查询所有样衣信息表
    @RequestMapping("/getAdmissionAll_cmy")
    @ResponseBody
    public PageInfo<Map> getAdmissionAll_cmy(PageEntity pageEntity){
        return biz.getAlladmission_cmy(pageEntity);
    }
//返回单号
    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public String selectByPrimaryKey(Integer number){
        String nu=biz.selectByPrimaryKey(number);
        return nu;
    }


    @RequestMapping("/getAllSampleListByPage_cmy")
    public   @ResponseBody PageInfo<Map> getAllSampleListByPage_cmy(PageEntity pageEntity, Tab_samplelist samplelist){
        System.out.println(samplelist.getSampleno());
              return biz.getAllSampleListByPage_cmy(pageEntity,samplelist);
    }

}
