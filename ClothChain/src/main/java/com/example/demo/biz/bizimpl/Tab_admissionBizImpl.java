package com.example.demo.biz.bizimpl;

import com.example.demo.biz.Tab_admissoonBiz;
import com.example.demo.dao.Tab_admissionMapper;

import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class Tab_admissionBizImpl implements Tab_admissoonBiz {
    @Resource
    private Tab_admissionMapper mapper;
    @Override
    public PageInfo<Map> getAlladmission_cmy(PageEntity pageEntity) {
        List<Map> list=mapper.getAlladmission_cmy();
        PageHelper.startPage(pageEntity.getPageNum(),pageEntity.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }
}
