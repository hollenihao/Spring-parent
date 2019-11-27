package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//上下文运行环境
@RunWith(SpringJUnit4ClassRunner.class)
//上下文配置
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptServiceImplTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testTransactionManager(){
           DeptServiceImpl  deptService = context.getBean(DeptServiceImpl.class);
            deptService.txDemo();

    }
}
