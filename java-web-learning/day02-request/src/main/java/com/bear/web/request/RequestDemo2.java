package com.bear.web.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * @program: IntelliJ IDEA
 * @description: Request对象获取请求头
 * @author: bear
 * @create: 2022-02-26 22:12
 **/
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求头数据
        //1.获取所有请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        //2.遍历
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            //根据名称获取请求头的值
            String value = request.getHeader(name);
            System.out.println(name + "---" + value);
        }

    }
}
