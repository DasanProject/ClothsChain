package com.example.demo.biz.bizimpl;

import com.example.demo.biz.Tab_lxyBiz;
import com.example.demo.dao.Tab_lxyMapper;
import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Tab_lxyBizImpl implements Tab_lxyBiz {
@Resource
private Tab_lxyMapper mappers;
/*****************客户管理******************/
    //查询客户
    public PageInfo<Map> queryCustomer(PageEntity page, String customername) {
        List<Map> list=mappers.queryCustomer(customername);
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }
    //添加客户
    @Override
    public void addCustomer(Tab_customer customer) {
        mappers.addCustomer(customer);
    }

    @Override
    //根据id查询
    public Tab_customer getOne(int id) {
        return mappers.getOne(id);
    }
    //修改
    @Override
    public void updateCustomer(Tab_customer customer) {
        mappers.updateCustomer(customer);
    }
/********************品牌管理******************/
    //查询品牌
    public PageInfo<Map> getAll(PageEntity page, String brandname) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Map> list = mappers.getbrand(brandname);
        PageInfo<Map> info = new PageInfo<Map>(list);
        return info;
    }

    @Override
    //查询客户
    public List<Map> getCustomer() {
        return mappers.getCustomer();
    }

    @Override
    //添加品牌
    public void addbrand(Tab_brand brand) {
        mappers.addbrand(brand);
    }
    //根据id查询

    @Override
    public Map queryOne(int id){
        return mappers.queryOne(id);
    }

    @Override
    //修改品牌信息
    public void updatebrand(Tab_brand brand) {
        mappers.updatebrand(brand);
    }
/*************************供应商管理**************************/
    //查询供应商
    public PageInfo<Map> getsuperlier(PageEntity page){
        List<Map> list=mappers.getsuperlier();
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }

    //新增供应商

    @Override
    public void addsuperlier(Tab_superlier superlier) {
        mappers.addsuperlier(superlier);
    }

    //根据id查询
    @Override
    public Map oneSuperlier(int id) {
        return mappers.oneSuperlier(id);
    }
    //修改
    @Override
    public void updateSuperlier(Tab_superlier superlier) {
        mappers.updateSuperlier(superlier);
    }
    /*******************物料类别管理****************/
    @Override
    public List<Map> getMaterialcategory() {//查询物料类别
        return mappers.getMaterialcategory();
    }


    //查询物料信息
    @Override
    public PageInfo<Map> getMaterial(PageEntity page) {
        List<Map> list=mappers.getMaterial();
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }
//查询供应商
    @Override
    public List<Map> findsuperlier() {
        return mappers.findsuperlier();
    }

    //添加物料信息
    @Override
    public void addMaterial(Tab_material material) {
        mappers.addMaterial(material);
    }

    //根据id查询一条物料信息
    @Override
    public Map findOneMaterial(int id) {
        return mappers.findOneMaterial(id);
    }

    //修改物料信息
    @Override
    public void updateMaterial(Tab_material material) {
        mappers.updateMaterial(material);
    }
  /*  ***************辅料管理****************/

    /*查询辅料*/
    @Override
    public PageInfo<Map> getAccessories(PageEntity page) {
        List<Map> list=mappers.getAccessories();
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        PageInfo<Map> info=new PageInfo<Map>(list);
        return info;
    }
    //新增物料
    @Override
    public void addAccessories(Tab_accessories a) {
        mappers.addAccessories(a);
    }
    //根据id查询物料
    @Override
    public Map getOneAccessiries(int id) {
        return mappers.getOneAccessiries(id);
    }
    //修改
    @Override
    public void updateAccessiries(Tab_accessories a) {
        mappers.updateAccessiries(a);
    }
}
