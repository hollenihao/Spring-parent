package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    EmployeeService service;
@RequestMapping("/index")

    public String index(){
   return  "index";
}

    @RequestMapping("/list")
    @ResponseBody
    public List<Employee> list(@RequestParam(value = "pageNum", defaultValue = "1" ,required = false)int pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "2",required = false)int pageSize){



    return service.getAll(pageNum, pageSize);
    }
}
