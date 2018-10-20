package com.example.demo.dao;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Tab_lxyMapper {
  /*  ********************************客户**********************/
    //分页查询
    List<Map> queryCustomer(String customername);
    //添加客户
    public void addCustomer(Tab_customer customer);
    //很据id查询
    public Tab_customer getOne(int id);
    /* 修改客户*/
    public void updateCustomer(Tab_customer customer);
    //修改状态
    public boolean updateState(int customerid, int state);
/***************品牌*************/
    //查询所有品牌
    public List<Map> getbrand(String brandname);
    //查询客户
    public List<Map> getCustomer();
    //添加品牌
    public void addbrand(Tab_brand brand);
    //根据id查询
    public Map queryOne(int id);

    //修改
    public void updatebrand(Tab_brand brand);

/* **************供应商管理查询所有供上******************/
    public List<Map> getsuperlier();
//新增供应商
     public void addsuperlier(Tab_superlier superlier);
     //根据id查询供应商
     public Map oneSuperlier(int id);
     //修改供应商信息
     public void updateSuperlier(Tab_superlier superlier);
  /*******************物料信息tab_materialcategory*********************/
    public List<Map> getMaterialcategory();//查询物料类别
    //物料类别and信息
    public List<Map> getMaterial();//物料信息
    //查询供应商
    public List<Map> findsuperlier();//查询供应商
    //添加物料
    public void addMaterial(Tab_material material);
    //根据id查询物料
    public Map findOneMaterial(@Param("id") int id);
    //修改物料信息
    public void updateMaterial(Tab_material material);
    /*********************辅料管理*******************/
    //查询辅料
     public List<Map> getAccessories();
      //新增辅料
    public void addAccessories(Tab_accessories a);
    //根据id查询
    public Map getOneAccessiries(int id);
    //修改
    public  void updateAccessiries(Tab_accessories a);
   /* *************颜色管理***************/
    public List<Map> getColor();
    //循环新增颜色
    public void addGoods(List<Tab_color> list);
    //根据id查询
    public  Map getOneColor(int id);
    //修改
    public void updateColor(Tab_color color);
}
