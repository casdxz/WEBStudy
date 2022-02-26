package com.bear.day01servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @program: IntelliJ IDEA
 * @description: Servlet路径配置 , urlPatterns
 * @author: bear
 * @create: 2022-02-26 21:22
 **/

//@WebServlet({"/d4","/dd4","/ddd4"})
//@WebServlet("/user/demo4")
//@WebServlet("/user/*")
//@WebServlet("/*")
@WebServlet("*.do")
public class ServletDemo4  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4....");
        System.out.println(req);
    }
}
