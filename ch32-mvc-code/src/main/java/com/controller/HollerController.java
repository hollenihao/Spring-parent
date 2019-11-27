package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HollerController {
    @RequestMapping("/holle")
    public String demo(){
        return "holle";
    }
}
