package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.cssl.filter")
@MapperScan("com.cssl.dao")
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);

	}

}
