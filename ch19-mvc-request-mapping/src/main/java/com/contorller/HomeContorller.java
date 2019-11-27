package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeContorller {
    @RequestMapping("/index")
    public String index(){
        return  "index";
    }

}
