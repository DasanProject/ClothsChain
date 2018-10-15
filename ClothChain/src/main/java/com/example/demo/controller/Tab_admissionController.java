package com.example.demo.controller;

import com.example.demo.dao.Tab_admissionMapper;
import com.example.demo.entity.Tab_admission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/aaa")
public class Tab_admissionController {
    @Resource
   private Tab_admissionMapper mapper;

    @RequestMapping("/bbb")
    @ResponseBody
    public String getOne(){
        Tab_admission admission=new Tab_admission();
        admission.setAdmissionmoney(3.12);
         mapper.insert(admission);
        return  "aaa";
    }

}
