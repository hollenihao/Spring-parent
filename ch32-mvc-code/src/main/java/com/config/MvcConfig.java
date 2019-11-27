package com.config;

import com.controller.MyFirstInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.controller")
@EnableWebMvc //等价于xml的mvc：annotation-driven
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        MyFirstInterceptor myFirstInterceptor = new MyFirstInterceptor();
            InterceptorRegistration interceptorRegistration = registry.addInterceptor(myFirstInterceptor);
            interceptorRegistration.addPathPatterns("/**");
    }
}
