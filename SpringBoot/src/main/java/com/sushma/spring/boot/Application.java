package com.sushma.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	
	}
@RequestMapping("/")
String WelcomeMsg()
{  System.out.println("Application.WelcomeMsg()");
	System.out.println("\"Hello, from spring boot app !!\"");
	return "homepage";
}
}
