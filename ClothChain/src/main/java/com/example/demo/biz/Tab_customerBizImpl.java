package com.example.demo.biz;

import com.example.demo.dao.Tab_customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Tab_customerBizImpl implements Tab_customerBiz{
     @Resource
     private Tab_customerMapper mappers;

    @Override
    public List<Map> queryCustomer() {//查询客户
        return mappers.queryCustomer();
    }
}
