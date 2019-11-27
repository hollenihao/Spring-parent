package com.controller;

import com.entity.EmpV;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController  {

    @RequestMapping("/index")
    //不由view管理返回join
    @ResponseBody
    public String index(){
        return  "index";
    }

    /**
     * http协议：
     * 1.请求行
     *2.请求头
     * 3.请求体
     *ResponseBody注解的含义：
     * 1.就是把方法返回的类型交给一个特殊的接口（HttpMessageConverter含义):指定可以在HTTP请求和响应之间进行转换的转换器
     * 2.处理的结果直接放到http响应体里
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public EmpV demo(){
        EmpV empV = new EmpV(2,"jk",new Date());

        return  empV;
    }

    /**
     * @ResponseBody：用在方法上
     * 不一样
     * @RequestBody：用在参数里，就是把请求传递过来的请求体
     * 中的数据利用消息转换器，转换为被它修饰的参数类型
     * @param empV
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public EmpV demo2(@RequestBody EmpV empV){

        System.out.println("empV : "+empV);
        EmpV result = new EmpV(1,"cj",new Date());
        return result;
    }
}
