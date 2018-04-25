package com.hjc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: hjc
 * @Description: 可以初始化数据库连接池等。基础随应用启动的一些操作
 * @param: null
 * @Date: 17:00 2018/4/25 0025
 * @return:
 * @throws:
 */
public class HJCServletContextListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        System.out.println(servletContext.getAttribute("id"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("context 销毁");
    }
}
