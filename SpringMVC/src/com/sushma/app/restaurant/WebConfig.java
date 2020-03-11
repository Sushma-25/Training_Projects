package com.sushma.app.restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
public class WebConfig {
    @Bean
	InternalResourceViewResolver viewResolve(){
	InternalResourceViewResolver isvr=new InternalResourceViewResolver();
	isvr.setPrefix("/WEB-INF/views/");
	isvr.setSuffix(".jsp");
	 
	 return isvr;
	 
 }
}
