package com.controller;

import com.entity.Employe;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.service.EmployeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class EmployeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        //读取文件并实例化对象
        EmployeService service = context.getBean("employeService",EmployeService.class);

        //页数
        int pageNum = Integer.parseInt(req.getParameter("page"));
        //每页有几条数据
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));

       List<Employe> emps = service.getAll(pageNum,pageSize);
        //pageInfo第二个构造函数是设定导航的个数。
        PageInfo<Employe> pageInfo = new PageInfo<>(emps,3);

        req.setAttribute("pageinfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
