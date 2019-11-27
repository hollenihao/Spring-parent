package com.config.annosupport;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan 相当于 component-Scan = “com” 扫描
@Configuration
@ComponentScan("com")
public class AonnSupportConfig {
}
