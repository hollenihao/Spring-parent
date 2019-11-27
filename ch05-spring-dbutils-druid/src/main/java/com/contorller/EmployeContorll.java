package com.contorller;

import com.entity.Employe;
import com.service.EmployeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class EmployeContorll extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeService service = context.getBean("employeService",EmployeService.class);
        Employe employe = service.getById();

        req.setAttribute("emp",employe);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
