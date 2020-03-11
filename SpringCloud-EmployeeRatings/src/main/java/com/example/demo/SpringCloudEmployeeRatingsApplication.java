package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudEmployeeRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmployeeRatingsApplication.class, args);
	}
	
	@RequestMapping("/empRatings/{eId}")
	List<Integer> getEmployeeRatings(@PathVariable("eId") int empId)
	{
		if(empId==1)
			return Arrays.asList(1,2,3,4);
		else
			
		return Arrays.asList(2,2,3,3);
		
	}

}
