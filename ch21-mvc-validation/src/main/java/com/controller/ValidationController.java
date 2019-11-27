package com.controller;

import com.entity.EmpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ValidationController {
    /**
     * @Valid:是验证标识，
     *验证*属性，方法参数或方法返回类型时，将验证在对象及其属性上定义的约束
     * @param empEntity
     * @return
     */

    @RequestMapping("/index")
    public ModelAndView index(@Valid EmpEntity empEntity , BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();

        //如有错误就返回
        if(bindingResult.hasErrors()){
            //获取字段的错误，返回特定的字段
          List<FieldError> errors =  bindingResult.getFieldErrors();
          //循环错误，有多少
            for(FieldError error:errors){
                //模型和视图。添加对象（返回错误的字段名，返回错误的信息）
            modelAndView.addObject(error.getField(),error.getDefaultMessage());
            }
            /**
             * 跳转到错误页面,视图名
             *
             * 设置此ModelAndView的视图名称，该名称将由*
             * DispatcherServlet通过ViewResolver解析。将覆盖任何*现有的视图名称或视图。
             */

            modelAndView.setViewName("error");
        }
            else{
                //效验成功页面
                modelAndView.setViewName("ok");

        }

        System.out.println("empEntity = " + empEntity);

        return modelAndView;
    }
}
