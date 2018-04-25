package com.hjc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HJCServletContextListenerSecond implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextLoder");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet 销毁2");
    }
}
