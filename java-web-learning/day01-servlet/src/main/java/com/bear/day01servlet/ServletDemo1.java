package com.bear.day01servlet;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: bear
 * @create: 2022-02-26 21:15
 **/
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 请求服务的方法
     *
     * @param servletRequest 请求对象
     * @param servletResponse 响应对象
     * @throws ServletException Servlet异常
     * @throws IOException  IO异常
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
