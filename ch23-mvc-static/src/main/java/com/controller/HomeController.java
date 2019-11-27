package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String demo(){
        System.out.println("request url:/");
        return "index";
    }

    @RequestMapping("/home.css")
    public String demo2(){
        System.out.println("request ulr: /home.css");
        return "index";
    }
}
