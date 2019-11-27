package controller;

import entity.Employe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeService;
import service.Impl.EmployeServiceImlp;
import spring.ApplicationContextHolder;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index1")
public class EmployeController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      EmployeServiceImlp context = ApplicationContextHolder.getBean("",EmployeServiceImlp.class);

        Employe employe = context.getById();

        req.setAttribute("emp",employe);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
