package com.test;

import com.entity.Employe;
import com.service.Impl.EmployeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeServiceImpl service = context.getBean("employeService",EmployeServiceImpl.class);
        Employe employe = service.getById();
        System.out.println("employe = " + employe);
    }
}
