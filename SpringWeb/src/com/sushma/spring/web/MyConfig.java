package com.sushma.spring.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.sushma.spring.web"})
public class MyConfig {
	@Bean
   InternalResourceViewResolver ViewResolve() {
	   InternalResourceViewResolver ir=new InternalResourceViewResolver();
	   ir.setPrefix("/WEB-INF/views/");
	   ir.setSuffix(".jsp");
	   
	   return ir;
   }
}
