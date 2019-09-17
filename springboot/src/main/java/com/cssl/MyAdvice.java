package com.cssl;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyAdvice {
	
	@ExceptionHandler(Exception.class)
	public String doException(Exception e) {
		System.out.println("exception:"+e.getMessage());
		return "error";
	}

}
