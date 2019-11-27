package com.config.annosupport.simple;

import com.dao.EmployeDao;
import com.dao.impl.EmployedaoImpl;
import com.service.impl.EmployeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfigIOC3 {
@Bean
    public EmployedaoImpl employeDao (){
    return new EmployedaoImpl();
}

    /**
     * 第三种方法
     * 利用autowired实现注入
     *理论是configuration修饰类除了是个配置类，它本身也是一个被spring管理类
     * ，所以可以注入
     *
     * @return
     */
    @Bean
    public EmployeServiceImpl employeService(){
    EmployeServiceImpl service = new EmployeServiceImpl();
    service.setDao(employeDao());
    return service;
}
}
