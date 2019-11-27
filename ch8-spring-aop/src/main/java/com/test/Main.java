package com.test;

import com.service.DeptServiceImpl;
import com.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl employee = context.getBean("employee",EmployeeServiceImpl.class);
        System.out.println("employee = " + employee.getClass());
        employee.insert();

        DeptServiceImpl dept = context.getBean("dept",DeptServiceImpl.class);

        System.out.println("dept--" + dept.getClass());

        dept.delete();
    }
}
