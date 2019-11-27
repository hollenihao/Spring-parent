package com.service.impl;

import com.config.annosupport.AonnSupportAopConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AonnSupportAopConfigTest {
    @Test
    public void testAonnSupportAopConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AonnSupportAopConfig.class);
        EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);

        service.update();
    }
}
