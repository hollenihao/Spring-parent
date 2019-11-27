package com.controller;

import com.entity.Emp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/formatter")
public class FormatterController {
/**
 * webDataBinder是DataBinder（数据绑定）的子类
 * 1.效验（判断数据是否合理，如密码是否有8位等
 * 2.类型转换（吧字符串转化为其他类型，如Integer等）
 * 3.处理绑定结果：可以得到哪些绑定有问题
 *
 * @InitBinder：初始化绑定给绑定器添加一些制定内容，比如格式化
 *
 *InitBinder注释修饰的方法要求：
 * 1.方法名任意
 * 2.方法的返回值必须是void
 * 3.方法的参数与requestMapping修饰方法参数一样
 * 4.方法的参数有多个
 *
 * 主要参数：
 * WebDataBinder
 *local：（本地化）
 *WebRequest
 *
 *Formatter:把字符串转换成其他类型或者相反，
 *Formatter适合在servlet环境下使用
 * Converter：用来在任意两类型转换
 *
 * 这两个接口是在spring3.0之后出现
 *
 *为了方便两个接口使用就有一个转换服务接口ConversionService
 *
 *以前spring进行类型转换是在jdk（主要用在窗口程序开发中）PropertyEditor体系
 *
 *PropertyEditor体系就是spring->其他类型，这种体系有俩中缺点
 * 1.线程不安全
 * 2跟ui的东西耦合
 *
 *
 *spring数据绑定时，首先判断容器中是否有ConversionService接口
 * 如果有就用服务转换，没有就退回（fallback）的原始的PropertyEditor体系来进行类型转换
 *
 * @InitBinder注解对绑定器设定只在本控制器有效，只对本控制器的请求方法有效
 * ，对其他控制器的请求方法无效
 *
 * 全局的绑定器
 *1.利用ControllerAdvice注解
 * 2.在spring配置元数据中设定
 */
    //这种注释只能处理的请求只能局部用
//    @InitBinder
//    public void xxx(WebDataBinder dataBinder){
//        dataBinder.addCustomFormatter(new EmpFormatter());
//        dataBinder.addCustomFormatter(new DateFormatter());
//    }

    /**
     * 下面是全局使用绑定器
     */

    @GetMapping("date")
    public String index(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date) {
        System.out.println("date = " + date);
        return "index";
    }

    //??? xxx
    @GetMapping("emp")
    public String index(@RequestParam("xx")Emp emp){
        System.out.println("emp = " + emp);
        return "index";
    }
}
