package com.service.impl;

import com.config.annosupport.simple.SimpleConfig;
import com.dao.EmployeDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimplConfigTest {

    @Test
    public void testSimplConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);
        System.out.println(service);

        EmployeDao dao = context.getBean(EmployeDao.class);
        System.out.println(dao);


    }
}
