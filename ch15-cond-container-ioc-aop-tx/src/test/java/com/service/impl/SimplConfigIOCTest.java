package com.service.impl;

import com.config.annosupport.simple.SimplConfigIOC2;
import com.config.annosupport.simple.SimpleConfigIOC;
import com.config.annosupport.simple.SimpleConfigIOC3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimplConfigIOCTest {
/*第一种方法，在方法中的参数调用

 */
    @Test
    public void testSImplCOnfigIOC(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfigIOC.class);

       EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);
        service.update();

    }

    //第二种方法跟第三种差不多,一个在外类，一个在类里
    @Test
    public void testSimpleConfig2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimplConfigIOC2.class);
        EmployeServiceImpl employeService = context.getBean(EmployeServiceImpl.class);

        employeService.update();
    }
    /**
     * 第三种方法是 利用autowired来实现注入 与第二种相同方法但是
     * 第二那种是 把字段写在同一个类中，第三种写在外面类
     * +有多种一样的类改选那种
     */

    @Test
    public void testSimplConfigIOC3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfigIOC3.class);

        EmployeServiceImpl serviceImpl = context.getBean(EmployeServiceImpl.class);
        serviceImpl.update();
    }
}
