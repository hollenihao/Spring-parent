package com.nf.controller;

import com.github.pagehelper.PageInfo;
import com.nf.entity.Employee;
import com.nf.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {
@Autowired
    private EmployeService service;

@RequestMapping("/index")
    public String demo(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize, Model model){
        List<Employee> employees = service.getAll(pageNum, pageSize);

        PageInfo pageInfo = new PageInfo(employees);
        model.addAttribute("list",pageInfo);

    return "index";
}
@RequestMapping("/add")
public String add(){
    return "add";
}

@RequestMapping("/isnrt")
    public String insert(@Valid Employee employee, BindingResult result){
if (result.hasErrors()){
    return "add";
}
service.insert(employee);
return "redirect:index";
}
}
