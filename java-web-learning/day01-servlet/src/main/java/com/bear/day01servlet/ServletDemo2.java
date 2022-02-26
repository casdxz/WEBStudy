package com.bear.day01servlet;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: bear
 * @create: 2022-02-26 21:15
 **/
public class ServletDemo2 implements Servlet {
    private static int age = 3;

    /**
     * 初始化方法
     * 在Servlet 被创建时执行，只会执行一次
     *
     * @param servletConfig servlet配置异常
     * @throws ServletException servlet异常
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    /**
     * 获取ServletConfig配置异常
     * @return ServletConfig
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时执行，可以执行多次
     * @param servletRequest 请求对象
     * @param servletResponse 响应对象
     * @throws ServletException Servlet异常
     * @throws IOException IO异常
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    /**
     * 获取Servlet的一些信息：版本、作者等等
     * @return String
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时执行，只执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");

    }
}
