package com;

import com.service.EmployeService;
import com.service.impl.EmployeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionTest {
    /**
     * 配置元数据可以通过xml+注解的形式来实现
     *1.在xml中配置context-component-scan
     * 2.实例化classpathxmlContext.xml文件，使用第一部xml文件
     *3.在需要管理的bean上面添加注解，这些bean所在的包必须第一部扫描范围之内
     *注解有四个：
     *Controller（）
     *Repository
     *Service
     *Component
     *
     * 本质上，4个注解多一样应为它们都是有Component修饰
     * 1.Controller：用在控制器类上面，spring mvc
     * 2.Repository：用在dao类上面，在某个spring版本更新后，spring对Repository注解
     *额外添加了功能，比如把数据库操作的相关异常，转换为spring的DataAccessException；
     *异常体系
     *3.service:用在Service
     * 4.以上三个注解都用不上的类就用Component注解入外部注入读取，properties文件到类上面
     * 就可以用Component注解
     *
     *
     * */


    @Test
    public void testAnnotaionHelloWorld(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);

        System.out.println(service);
    }

@Test
    public void testAnnotaion(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeServiceImpl serviceImpl = context.getBean(EmployeServiceImpl.class);

    serviceImpl.update();
}

@Test
    public void testAnnotaion_ioc_collection(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeServiceImpl service = context.getBean(EmployeServiceImpl.class);
        service.displayAutowireCollectionInject();
}
}
