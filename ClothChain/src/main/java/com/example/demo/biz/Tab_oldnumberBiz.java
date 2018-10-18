package com.example.demo.biz;

import com.example.demo.entity.Tab_oldnumber;

public interface Tab_oldnumberBiz {
    //根据类型id查询出单号信息。返回给controller一个字符串单号。(按照mapper文件中自动生成的方法)
    public String selectByPrimaryKey(int typeid);
}
