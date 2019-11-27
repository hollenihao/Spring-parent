package com.nf.controller;

import com.nf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {

    @Autowired
    private DeptService service;
@RequestMapping("/dept")
    public String dept(){
    return "dept";
}
@RequestMapping("/delete")
    public String delete(int id){
    service.deleteById(id);
    return "redirect:dept";
}
}
