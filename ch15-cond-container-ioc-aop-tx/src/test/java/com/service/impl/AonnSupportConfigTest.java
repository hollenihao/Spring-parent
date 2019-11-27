package com.service.impl;

import com.config.annosupport.AonnSupportConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AonnSupportConfigTest {
    @Test
    public void testAonnSupportConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AonnSupportConfig.class);
        EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);
        service.update();
    }
}
