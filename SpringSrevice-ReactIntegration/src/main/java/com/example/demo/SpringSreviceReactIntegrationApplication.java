package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class SpringSreviceReactIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSreviceReactIntegrationApplication.class, args);
	}

	@RequestMapping("/getdetails")

	List<Internship> getDetails() {
System.out.println("Service caled..");
		return Arrays.asList(new Internship(1, "Red Hat Microservices", "5 Months"),
				new Internship(2, "FSD", "3 Months"), new Internship(3, " UI/UX", "2 Months"));

	}

}

class Internship {
	int refNo;
	String name;
	String duration;

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Internship [refNo=" + refNo + ", name=" + name + ", duration=" + duration + "]";
	}

	public Internship(int refNo, String name, String duration) {
		super();
		this.refNo = refNo;
		this.name = name;
		this.duration = duration;
	}

	public Internship() {
		super();
		// TODO Auto-generated constructor stub
	}

}
