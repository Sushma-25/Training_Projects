package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class SpringCloudEmployeeAppraisalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmployeeAppraisalServiceApplication.class, args);
	}
   
	@Bean
	@LoadBalanced //it helps 
	RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
