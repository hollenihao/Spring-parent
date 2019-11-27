package com.nf.controller;

import com.github.pagehelper.PageInfo;
import com.nf.entity.Employe;
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
public class HomeController {

    @Autowired
    private EmployeService service;

    @RequestMapping("/index")
    public String demo(){
       return  "index";
    }


    @RequestMapping("/list")
    public String lsit(@RequestParam(value = "pageNum" ,required = false,defaultValue = "1")int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize ,
                       Model model){
        List<Employe> employes = service.getAll(pageNum, pageSize);

        PageInfo pageInfo = new PageInfo(employes);
        model.addAttribute("list",pageInfo);
        return "index";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/insert")
    public String insert(@Valid Employe employe, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "add";
        }
        service.isnert(employe);
        return "redirect:index";
    }
}
