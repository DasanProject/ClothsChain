package com.example.demo.biz.bizimpl;

import com.example.demo.biz.CmyBiz;
import com.example.demo.dao.CmyMapper;
import com.example.demo.dao.Tab_oldnumberMapper;
import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CmyBizImpl implements CmyBiz {
    @Resource
    private CmyMapper mappers;
    @Resource
    private Tab_oldnumberMapper oldnumberMapper;

    //查询尺寸表
    public List<Tab_size> getSize_cmy(){
        return mappers.getSize_cmy();
    }
    //查新品牌表
    public List<Tab_brand> getBrand_cmy(Integer customerid){
        return  mappers.getBrand_cmy(customerid);
    }

    @Override
    public List<Tab_sampletype> getSampletype_cmy() {
        return mappers.getSampletype_cmy();
    }

    @Override
    public List<Tab_quarterly> getQuarterly_cmy() {
        return mappers.getQuarterly_cmy();
    }

    @Override
    public List<Tab_stylelibrary> getStylelibrary_cmy() {
        return mappers.getStylelibrary_cmy();
    }

    public PageInfo<Map> getAlladmission_cmy(PageEntity pageEntity) {
        List<Map> list=mappers.getAlladmission_cmy();
        PageHelper.startPage(pageEntity.getPageNum(),pageEntity.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }
    public List<Map> getCustomer_cmy() {
        return mappers.getCustomer_cmy();
    }
    //创建单号 陈梦月
    public String selectByPrimaryKey(int typeid) {
        String returnnum="";
        //获得单号returnnum
        Tab_oldnumber tab_oldnumber=oldnumberMapper.selectByPrimaryKey(typeid);
        String prefix=tab_oldnumber.getPrefix();
        if(typeid==6){
            String number=tab_oldnumber.getNumber().toString();
            String middle="";
            for (int i=0;i<4-number.length();i++){
                middle="0"+middle;
            }
            returnnum=""+middle+number;
        }else{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date date=new Date();
        String datenum=sdf.format(date);
        String number=tab_oldnumber.getNumber().toString();
        String middle="";
        for (int i=0;i<6-number.length();i++){
            middle="0"+middle;
        }
         returnnum=""+prefix+datenum+middle+number;}
        //将数据库中的数据自增1
        Tab_oldnumber t=new Tab_oldnumber();
        int aa= tab_oldnumber.getNumber()+1;
        t.setNumber(tab_oldnumber.getNumber()+1);
        t.setOldnumber(typeid);
        Integer a=oldnumberMapper.updateByPrimaryKeySelective(t);
        return returnnum;
    }

    public PageInfo<Map> getAllSampleListByPage_cmy(PageEntity pageEntity, Tab_samplelist tab_samplelist) {
        PageHelper.startPage(pageEntity.getPageNum(),pageEntity.getPageSize());
        List<Map> list=mappers.getAllSampleListByPage_cmy(tab_samplelist);
        PageInfo<Map> info=new PageInfo<Map>(list);
        System.out.println(info);
        return info;
    }


}
