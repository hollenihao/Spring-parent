package com.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        System.out.println("---ant---");
        HttpSession session =request.getSession();
       String username = (String) session.getAttribute("username");
       if (username == null){
           //username为空返回登入页面
           response.sendRedirect("/login");
           return false;
       }

      return true;

    }
}
