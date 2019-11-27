package com;

import com.service.ClasService;
import com.service.EmployeService;
import com.service.impl.EmployeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.tree.VoidDescriptor;

public class AopTest {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClasService service = context.getBean(ClasService.class);
        int reult =  service.add(2,3);
        System.out.println(reult);
    }
}
