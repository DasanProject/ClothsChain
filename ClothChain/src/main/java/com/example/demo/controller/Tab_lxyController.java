package com.example.demo.controller;

import com.example.demo.biz.Tab_lxyBiz;
import com.example.demo.entity.*;
import com.example.demo.util.PageEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("lxy")
public class Tab_lxyController {
    @Resource
    private Tab_lxyBiz biz;

/*************************客户管理*************************/
    @RequestMapping("/queryCustomer")
    @ResponseBody
    //查询客户lxy
    public PageInfo<Map> lxy_queryCustomer(PageEntity page, String customername){
        return biz.queryCustomer(page,customername);

    }
    //添加客户lxy
    @RequestMapping("/addCustomer")
    @ResponseBody
    public void lxy_addCustomer(Tab_customer customer){
        customer.setState(0);
        biz.addCustomer(customer);
    }
    //根据id查询lxy
    @RequestMapping("/getOne")
    @ResponseBody
    public Tab_customer lxy_getOne(int id) {
        return biz.getOne(id);
    }
    @RequestMapping("/updateCustomer")
    @ResponseBody
    public void lxy_update(Tab_customer customer){
        biz.updateCustomer(customer);
    }

/*    ***********************品牌管理***********************/
@RequestMapping("/getbrand")
@ResponseBody
public PageInfo<Map> lxy_getbrand(PageEntity page, String brandname) {
    return biz.getAll(page,brandname);
}

    //查询客户
    @RequestMapping("/getCustomer")
    @ResponseBody
    public List<Map> lxy_getCustomer(){

        return biz.getCustomer();
    }
    //添加品牌
    @RequestMapping("/addbrand")
    @ResponseBody
    public void lxy_addbrand(Tab_brand brand){

        biz.addbrand(brand);
    }
    //根据id查询
    @RequestMapping("/queryOne")
    @ResponseBody
    public Map lxy_queryOne(int id){
        Map m=biz.queryOne(id);
        System.out.println("ddd"+m);
        return m;
    }
    //修改品牌信息
    @RequestMapping("/updatebrand")
    @ResponseBody
    public void lxy_updatebrand(Tab_brand brand){
        biz.updatebrand(brand);
    }
   /* **********************供应商管理***********************/
   @RequestMapping("/getsuperlier_lxy")
   @ResponseBody
   public PageInfo<Map> lxy_getsuperlier(PageEntity page){
       System.out.println("aa"+biz.getsuperlier(page));
       return biz.getsuperlier(page);

   }
   //新增供应商
    @RequestMapping("/addsuperlier")
    @ResponseBody
    public void addsuperlier(Tab_superlier superlier){

        superlier.setState(0);//状态
        superlier.setDay(0);//提前天数
        biz.addsuperlier(superlier);
    }
    //根据id查询供应商
    @RequestMapping("/oneSuperlier")
    @ResponseBody
  public Map lxy_oneSuperlier(int id){
       Map m=biz.oneSuperlier(id);
       return m;
  }
  //修改供应商信息
    @RequestMapping("/updateSuperlier")
    @ResponseBody
  public void lxy_updateSuperlier(Tab_superlier superlier){
       biz.updateSuperlier(superlier);
  }
/***************物料类别管理**********************/
@RequestMapping("/getMaterialcategory")
@ResponseBody
public List<Map> lxy_getMaterialcategory(){//查询物料类别
    return biz.getMaterialcategory();
}
//查询物料信息
    @RequestMapping("/getMaterial")
    @ResponseBody
    public PageInfo<Map> lxy_getMaterial(PageEntity page){
     return biz.getMaterial(page);
    }
//查询供应商
    @RequestMapping("/findsuperlier")
    @ResponseBody
    public List<Map> lxy_findsuperlier(){
        return biz.findsuperlier();
    }

    //添加物料信息
    @RequestMapping("/addMaterial")
    @ResponseBody
    public void lxy_addMaterial(Tab_material material){
     System.out.println(material.getMaterialname()+material.getColor()+"aa");
    biz.addMaterial(material);
    }
//根据id查询一条物料信息
    @RequestMapping("/findOneMaterial")
    @ResponseBody
    public Map lxy_findOneMaterial(int id){
    Map m=biz.findOneMaterial(id);
    return m;
    }
    @RequestMapping("/updateMaterial")
    @ResponseBody
    //修改物料信息
    public void lxy_updateMaterial(Tab_material material){
    biz.updateMaterial(material);
    }
   /* **************辅料管理****************/
    //查询辅料
    @RequestMapping("/getAccessories")
    @ResponseBody
    public PageInfo<Map> lxy_getAccessories(PageEntity page){
        System.out.println(biz.getAccessories(page)+"sssss");
       return biz.getAccessories(page);
    }
    @RequestMapping("/addAccessories")
    @ResponseBody
    //新增物料
    public void lxy_addAccessories(Tab_accessories a){
        biz.addAccessories(a);
    }
    //根据id查询辅料
    @RequestMapping("/getOneAccessories")
    @ResponseBody
    public Map lxy_getOneAccessories(int id){
        Map m=biz.getOneAccessiries(id);
        return m;
    }
    //修改
    @RequestMapping("/updateAccessories")
    @ResponseBody
    public void lxy_updateAccessories(Tab_accessories a){
        biz.updateAccessiries(a);
    }
}
