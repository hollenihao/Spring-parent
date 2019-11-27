package com.config.annosupport.simple;

import com.dao.EmployeDao;
import com.dao.impl.EmployedaoImpl;
import com.service.impl.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimplConfigIOC2 {
    /**
     * 第二种方法用autowired注入
     * 理论上configuration修饰的类除了是个配置类
     * 它本身也是一个被spring管理类，所有可以注入
     */

    @Autowired
    private EmployeDao dao;
    @Bean
    public EmployedaoImpl employedao(){ return new EmployedaoImpl();}

    @Bean
    public EmployeServiceImpl employeService (){
        EmployeServiceImpl service = new EmployeServiceImpl();
        service.setDao(dao);
        return service;
    }
}
