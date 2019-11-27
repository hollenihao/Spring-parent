package com.controller;

import com.entity.Employe;
import com.service.EmployeService;
import com.service.impl.EmployeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class EmployeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());

        EmployeService employeService = context.getBean("employeService",EmployeService.class);

        Employe employe =employeService.getById();

        req.setAttribute("emp",employe);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
