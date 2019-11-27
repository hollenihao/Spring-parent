package com.config.annosupport;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @enableAspectJAutoProxy 相当于aspectj-autoproxy 自动代理类
 */
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AonnSupportAopConfig {

}
