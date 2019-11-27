package com.config.annosupport.simple;

import com.dao.impl.EmployedaoImpl;
import com.service.impl.EmployeServiceImpl;
import org.springframework.context.annotation.Bean;

public class SimpleConfig {
    @Bean
    public EmployedaoImpl employedao(){
        return new EmployedaoImpl();
    }
    @Bean
    public EmployeServiceImpl employeService(){
        return new EmployeServiceImpl();
    }
}
