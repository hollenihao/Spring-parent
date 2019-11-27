package com.controller;

import com.entity.Emp;
import com.entity.Evo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeContorller {

    @GetMapping("wrapper")
    public String index(String ab,Integer pageNo){
        System.out.println("ab = " + ab);
        System.out.println("pageNo = " + pageNo);
        return "index";
    }

    @GetMapping("/simple")
    public String index2(int pageNo){
        System.out.println("pageNo = " +pageNo);
        return "index";
    }

    @GetMapping("simple2")
    public String index3(@RequestParam(value = "page",required = false,defaultValue = "1") int pageNo){
        System.out.println("pageNo = " + pageNo);

        return "index";
    }
//省略page pageNo代替了page
    @GetMapping("simple/page/{pageNo}")
    public String index4(@PathVariable("pageNo") int pageNo){
        System.out.println("pageNo = " + pageNo);

        return "index";
    }

    @GetMapping("complex")
    public String index5(Emp emp){
        System.out.println("EMP = " + emp);
        return "index";
    }

    @GetMapping("/list")
    public String index5(Evo evo){
        System.out.println("evo = " + evo);

        return  "index";
    }

    @GetMapping("array")
    public String index(String[] name){
        System.out.println("mane = "+ name);

        return "index";
    }
}
