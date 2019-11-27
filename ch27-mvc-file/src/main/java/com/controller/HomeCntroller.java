package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCntroller {
    @RequestMapping("/index")
    public String demo(){
        return "index";
    }
}
