package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DbConfig {
//@Autowired
//private Environment environment;

@Value("${jdbc:username}")
    private String username;
public String getData(){

    return username;
// return environment.getProperty("jdbc:username");
}
}
