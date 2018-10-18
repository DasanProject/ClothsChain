package com.example.demo.controller;

        import com.example.demo.biz.Tab_oldnumberBiz;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

        import javax.annotation.Resource;

@Controller
@RequestMapping("/oldnumber")
public class Tab_oldnumberController {
    @Resource
    private Tab_oldnumberBiz biz;
    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public String selectByPrimaryKey(Integer number){
        String nu=biz.selectByPrimaryKey(number);
        return nu;
    }
}
