package com.cssl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cssl.service.UsersService;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/*")
public class MyFilter implements Filter {
	
	public MyFilter() {
		System.out.println("MyFilter无参构造。。。"+service);
	}

	private ServletContext application;
	private UsersService service;	
	
	public void init(FilterConfig fConfig) throws ServletException {
		application = fConfig.getServletContext();
		ApplicationContext ctx=WebApplicationContextUtils.getWebApplicationContext(application);
		service = ctx.getBean(UsersService.class);
		System.out.println("初始化。。。"+service);
	}
  
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter:"+service);
		chain.doFilter(request, response);
	}

	public void destroy() {
		System.out.println("销毁。。。");
	}

}
