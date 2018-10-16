package com.example.demo.controller;

import com.example.demo.biz.Tab_admissoonBiz;
import com.example.demo.biz.bizimpl.Tab_admissionBizImpl;
import com.example.demo.dao.Tab_admissionMapper;
import com.example.demo.entity.Tab_admission;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/aaa")
public class Tab_admissionController {
    @Resource
   private Tab_admissoonBiz biz;
@RequestMapping("/getAdmissionAll_cmy")
@ResponseBody
public PageInfo<Map> getAdmissionAll_cmy(PageEntity pageEntity){
    System.out.println(pageEntity.getPageNum());
    System.out.println(biz.getAlladmission_cmy(pageEntity).getSize());

    return biz.getAlladmission_cmy(pageEntity);
}
}
