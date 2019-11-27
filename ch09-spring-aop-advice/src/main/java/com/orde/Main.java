package com.orde;

import com.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_orde.xml");

        EmployeeServiceImpl employeeService = context.getBean("employeeService",EmployeeServiceImpl.class);

         int result =  employeeService.add(2,3);
        System.out.println(result);
    }
}
