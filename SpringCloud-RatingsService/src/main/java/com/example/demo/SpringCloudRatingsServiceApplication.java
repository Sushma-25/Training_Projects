package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringCloudRatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRatingsServiceApplication.class, args);
	}
     @RequestMapping("/ratings")
	  List<RatingInfo> getRatings()
	  {
		  
		  return Arrays.asList(new RatingInfo(1,"Excellent"),new RatingInfo(2,"Exceeds"),new RatingInfo(3,"Meets"),new RatingInfo(4,"Average"),new RatingInfo(5,"Below Average"));
	  }
	  
	  
	  
}


class RatingInfo{
	
	int id;
	String name;
	public RatingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "RatingInfo [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
