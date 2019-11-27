package com.controller.view;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ViewDemoController {
    /**
     * mvc理念：view对象不能直接访问，只能直接访问控制器
     * 由控制器去访问view（而且安装servlet技术，基本转发到视图）
     *请求方法之间的访问，基本多是重定向
     *
     * 显示视图种方法
     * 第一种方法，以字符串返回视图名
     *
     * 第二种方法，modelAndView类型
     */

    @RequestMapping("/index1")
    public String index(){
        return "index";
    }



    @RequestMapping("/index3")
    public ModelAndView index3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        return modelAndView;
    }

        //这是forward：url
        //url是在WEB-INF外的路径，不能访问web-inf的视图
    @RequestMapping("/index2")
    public String index2(){
        return "forward:view";
    }
    /**
     * 重定向（redirect）：指在请求多个方法之间的跳转
     * 重定向两种方法
     *
     * 1. redirect
     * 2.类型RedirectView
     * @return
     */
    @RequestMapping("/index4")
    public String index4(HttpServletRequest request){
        request.setAttribute("f","index4 重定向1");
        return "redirect:index1";
    }

    @RequestMapping("/index5")
    public RedirectView index5(){
        RedirectView redirectView = new RedirectView("index");

        return redirectView;
    }
}
