package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class NewTicketBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewTicketBookingSystemApplication.class, args);
		}
	
	@RequestMapping("/homepage")
	String WelcomeMsg()
	{  System.out.println("Application.WelcomeMsg()");
		System.out.println("Hello, from spring boot app !!");
		return "homepage";
	}

}
