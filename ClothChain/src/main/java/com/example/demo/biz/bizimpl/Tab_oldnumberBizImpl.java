package com.example.demo.biz.bizimpl;

import com.example.demo.biz.Tab_oldnumberBiz;
import com.example.demo.dao.Tab_oldnumberMapper;
import com.example.demo.entity.Tab_oldnumber;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Tab_oldnumberBizImpl implements Tab_oldnumberBiz {
    @Resource
    private Tab_oldnumberMapper mappers;
    @Override
    //创建单号 陈梦月
    public String selectByPrimaryKey(int typeid) {
        //获得单号returnnum
        Tab_oldnumber tab_oldnumber=mappers.selectByPrimaryKey(typeid);
        String prefix=tab_oldnumber.getPrefix();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date date=new Date();
        String datenum=sdf.format(date);
        String number=tab_oldnumber.getNumber().toString();
        String middle="";
            for (int i=0;i<6-number.length();i++){
                middle="0"+middle;
            }
            String returnnum=""+prefix+datenum+middle+number;
         //将数据库中的数据自增1
      Tab_oldnumber t=new Tab_oldnumber();
       int aa= tab_oldnumber.getNumber()+1;
        t.setNumber(tab_oldnumber.getNumber()+1);
        t.setOldnumber(typeid);
        Integer a=mappers.updateByPrimaryKeySelective(t);
        return returnnum;
    }




}
