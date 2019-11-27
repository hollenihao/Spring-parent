package com.service.impl;

import com.config.annosupport.AonnSupporTxConfig;
import com.config.annosupport.HelloConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeServiceImplTest {
    @Test
    public void testHelloConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);

        service.update();

    }
}
