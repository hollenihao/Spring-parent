package com.nf.demo.controller;

import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService service;
@RequestMapping("/list")
    public String list(){
    return "index";

}
@RequestMapping("/delete")
public String delete(int deptid){
    service.deleteById(deptid);
return "redirect:list";
}
}
