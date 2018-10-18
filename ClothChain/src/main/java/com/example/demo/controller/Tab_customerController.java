package com.example.demo.controller;

import com.example.demo.biz.Tab_customerBiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")

public class Tab_customerController {
    @Resource
    private Tab_customerBiz biz;
    @RequestMapping("/queryCustomer")
    @ResponseBody
    public List<Map>  lxy_queryCustomer(){//查询客户
         System.out.println("aa");
         List<Map> list=biz.queryCustomer();
         return list;
    }
    //陈梦月查询客户
    @RequestMapping("/getCustomer_cmy")
    @ResponseBody
    public List<Map> getCustomer_cmy(){

        return biz.getCustomer_cmy();
    }
}
