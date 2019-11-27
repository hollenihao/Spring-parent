package com.config.annosupport;

import com.dao.EmployeDao;
import com.service.impl.EmployeServiceImpl;
import com.service.impl.EmployeServiceImpl2;
import com.dao.impl.EmployedaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    /**
     * 注册@Bean注解方式，是用来往spring注册bean，没有@Scope（作用域），默认是单例
     *
     *bean是方法，如果放到@Configuration修饰类中，那么此类会被动态代理类
     *bean方法已经被动态代理
     *
     *代理后逻辑：
     *1.检查当前spring容器中有没有这个bean已经被注册
     *没有就调用这个方法，有就返回，什么也不干
     * @return
     */
    @Bean
    public EmployedaoImpl employedao (){
        return new EmployedaoImpl();
    }


    public EmployeServiceImpl employeService(EmployeDao dao){
            EmployeServiceImpl service = new EmployeServiceImpl();
            service.setDao(dao);
        return service;
    }

    @Bean
    public EmployeServiceImpl2 employeDaoImpl2(){
    EmployeServiceImpl2 serviceImpl2 = new EmployeServiceImpl2();

    serviceImpl2.setDao(employedao());
    return  serviceImpl2;
    }
}
