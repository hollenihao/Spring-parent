package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConter.xml");

        FrilstString frilstString = (FrilstString) applicationContext.getBean("first");
        FrilstString frilstString1 = applicationContext.getBean("first",FrilstString.class);
        System.out.println("frilstString = " + frilstString);
        System.out.println("frilstString1 = " + frilstString1);
    }
}
