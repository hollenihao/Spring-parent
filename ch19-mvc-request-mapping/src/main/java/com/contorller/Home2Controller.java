package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home2Controller {
    /**
     * RequestMapping 支持ant地址格式
     * @return
     */
    @RequestMapping("/**/*index2")
    public String home(){
        return "index";
    }

    /**
     *这种处理方法是默认处理方法
     *fallback（备胎）
     * @return
     */
//    @RequestMapping("*")
//    public String home2(){
//        return "index";
//    }


    @RequestMapping(value = {"/index3","/index"})
    public String home3(){
        return "index";
    }
}
