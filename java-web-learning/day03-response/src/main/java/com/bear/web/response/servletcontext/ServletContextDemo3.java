package com.bear.web.response.servletcontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @program: IntelliJ IDEA
 * @description: ServletContext功能 ：域对象：共享数据
 * @author: bear
 * @create: 2022-02-26 22:50
 **/
@WebServlet("/servletContextDemo3")
public class ServletContextDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 通过HttpServlet获取
        ServletContext context = this.getServletContext();
        //设置数据
        context.setAttribute("msg", "hello world");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
