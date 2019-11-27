package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class properties {
    @Test
    public void testProperties(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
