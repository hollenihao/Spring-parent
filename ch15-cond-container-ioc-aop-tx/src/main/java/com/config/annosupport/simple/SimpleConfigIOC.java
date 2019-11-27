package com.config.annosupport.simple;

import com.dao.EmployeDao;
import com.dao.impl.EmployedaoImpl;
import com.service.impl.EmployeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfigIOC {
    /**
     * 利用bean方法注入有参数
     * @return
     */
    @Bean
public EmployedaoImpl employedao(){
        return new EmployedaoImpl();
    }
@Bean
    public EmployeServiceImpl employeService(EmployeDao dao){
        EmployeServiceImpl service = new EmployeServiceImpl();
        service.setDao(dao);
        return service;

}
}
