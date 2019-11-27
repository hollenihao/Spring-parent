package com.nf.demo.controller;

import com.github.pagehelper.PageInfo;
import com.nf.demo.entity.EmployeeEntity;
import com.nf.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {
   @Autowired
   EmployeeService service;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                     @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize, Model model){
        List<EmployeeEntity> employeeEntities = service.getAll(pageNum, pageSize);

                PageInfo pageInfo = new PageInfo<>(employeeEntities);
                model.addAttribute("lsit",pageInfo);

        return  "index";
    }

    @RequestMapping("/add")
        public String add(){

    return "add";
        }

        @RequestMapping("/insert")
    public String insert(@Valid EmployeeEntity employeeEntity, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "add";
        }
        service.insert(employeeEntity);
        return "redirect:list";
        }
}
