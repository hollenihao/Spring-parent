package com.controller;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstInterceptor  implements HandlerInterceptor {
@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler){
    System.out.println("preHandler---");
    return true;
}
}
