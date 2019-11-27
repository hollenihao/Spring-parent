package com.config.annosupport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//@EnableAspectJAutoProxy相当于 事务
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AonnSupporTxConfig {


}
