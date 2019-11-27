package com.spring;

import com.sun.net.httpserver.HttpServer;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class ApplicationContextUtils {
    public static ApplicationContext getapplicationContext(HttpServletRequest req){
        ServletContext servletContext = req.getServletContext();
        ApplicationContext context = (ApplicationContext) servletContext.getAttribute(ApplicationContextInstantiateListener.SPRING_CONTAINER_KEY);
    return context;
    }
}
