package com.cssl.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

	/**
     * @see 销毁
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("销毁application");
    }

	/**
     * @see 创建application
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("创建application");
    }
	
}
