package com.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")//读取外部文件
@MapperScan("com.dao")//mybatis-spring提供扫描mapper接口用来创建实现类
@ComponentScan({"com.service","com.aspect"})//扫描业务类
@EnableAspectJAutoProxy//启用aspect自动代理类
@EnableTransactionManagement //开启事务功能

public class AppConfig {
/**
 *去出db。properties三个值
 */

@Value("${jdbc.url}")
private String url;
@Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
private String password;

//连接数据库
@Bean
    public DataSource dataSource(){
    DruidDataSource druidDataSource = new DruidDataSource();
    druidDataSource.setUrl(url);
    druidDataSource.setUsername(username);
    druidDataSource.setPassword(password);

    return  druidDataSource;
}

@Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    //连接数据给sql工厂bean
    sqlSessionFactoryBean.setDataSource(dataSource());

    //这个类支持路径模式，比如classpath*即ant格式
    PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
     Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath*:com/dao/mappers/**/*.xml");

     //设置映射器位置
     sqlSessionFactoryBean.setMapperLocations(resources);

    //主要是处理配置信息，当前只有日志功能
    sqlSessionFactoryBean.setConfigLocation((Resource) configuration());

//配置插件
    sqlSessionFactoryBean.setPlugins(pageInterceptor());
    return sqlSessionFactoryBean.getObject();
}

//数据库事务管理器
@Bean
    public DataSourceTransactionManager transactionManager(){
    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    transactionManager.setDataSource(dataSource());

    return transactionManager;
}

private org.apache.ibatis.session.Configuration configuration(){
    org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();

//    输出到控制台
    configuration.setLogImpl(StdOutImpl.class);

//吧下划线转化（user_name）为驼峰命名法(userName) 在实体类
    configuration.setMapUnderscoreToCamelCase(true);

    return configuration;
}

    private PageInterceptor pageInterceptor(){
        PageInterceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();

        properties.put("supportMethodArguments","true");
        properties.put("reasonable","true");

        interceptor.setProperties(properties);
        return interceptor;
    }
}
