package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home3Controller {
    /**
     * requestMapping属性 value可以写多个
     *这个方法只处理GET请求，请求地址index4
     *
     * 其他属性：
     * params（参数）{a=5}
     * headers（请求头），
     *produces（产生，生产）依据请求信息中的accent来限
     * consumes(消费)浏览器传过来的内容必须是某个类型
     * @return
     */

    @RequestMapping(value = "/index4",method = RequestMethod.GET)
    public String index(){

        return "flow";
    }
    //index4地址，只处理post请求
    @RequestMapping(value = "/index4",method = RequestMethod.POST)
    public String index2(){
        return "flow";
    }

    @RequestMapping(value = "/index1" ,params = "a=2" ,headers = "b=3",
            produces = "application/json",consumes = "text/html" )
    public String index3(){
        return "flow";
    }
}
