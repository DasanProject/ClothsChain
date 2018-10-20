package com.example.demo.biz;

import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;


public interface Tab_lxyBiz {
  /*  *************************客户管理**************************/
    //查询客户
    public PageInfo<Map> queryCustomer(PageEntity page, String customername);
    //添加客户
    public void addCustomer(Tab_customer customer);
    //根据id查询
    public Tab_customer getOne(int id);
    //修改
    public void updateCustomer(Tab_customer customer);
 /*   ************************品牌管理***************************/
 //品牌管理
 public PageInfo<Map> getAll(PageEntity page, String brandname);
    //查询客户
    public List<Map> getCustomer();
    //添加品牌
    public void addbrand(Tab_brand brand);
    //根据id查询
    public Map queryOne(int id);
    //修改品牌信息
    public void updatebrand(Tab_brand brand);
   /* *********************供应上管理*******************/
   //供应商管理
   public PageInfo<Map> getsuperlier(PageEntity page);
   //新增供应商
    public void addsuperlier(Tab_superlier superlier);
    //根据id 查询供应商
    public Map oneSuperlier(int id);
    //修改供应商
    public void updateSuperlier(Tab_superlier superlier);
    /************************物料类别管理******************/
    public List<Map> getMaterialcategory();//查询物料类别
    //查询物料信息
    public PageInfo<Map> getMaterial(PageEntity page);
    //查询供应商
   public List<Map> findsuperlier();
   //添加物料信息
    public void addMaterial(Tab_material material);
    //根据id查询物料信息
    public Map findOneMaterial(int id);
    //修改物料信息
    public void updateMaterial(Tab_material material);
    /*******************辅料管理*****************/
    /**************查询辅料*************/
    public PageInfo<Map> getAccessories(PageEntity page);
    //新增辅料
    public void addAccessories(Tab_accessories a);
    //根据id查询辅料
    public Map getOneAccessiries(int id);
    //修改
    public  void updateAccessiries(Tab_accessories a);
}
