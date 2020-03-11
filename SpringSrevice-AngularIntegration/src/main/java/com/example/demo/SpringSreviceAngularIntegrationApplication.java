package com.example.demo;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SpringSreviceAngularIntegrationApplication {
	List<Department> depts = new ArrayList<Department>();
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSreviceAngularIntegrationApplication.class, args);
	}

	@RequestMapping("/fetchDepartments")
	List<Department> listDepartments() {
		System.out.println("Called our serviceeeeeeeeeeeeeeeeeeeeeeeeeeeeeee......................");
		List<Department> depts = new ArrayList<Department>();
		depts = Arrays.asList(new Department(1, "Security", "Employee security,Asset Security", "EGL"),
				new Department(2, "Knowledge", "Internal products training", "Embessy golf "),
				new Department(3, "Facilities", "Wash room supplies,Food beverages", "subramanya Arcade"));
		
		return depts;
	}

	@GetMapping("/getDepartments/{title}")
	String getDepartment(@PathVariable("title") String title) {
		System.out.println(title);
		return title;
	}

	@PostMapping("/addDepartment")
	public List<Department> create(@RequestBody Department dept) {
        System.out.println(dept);
		depts.add(dept);
		return depts;
	}
}

class Department {
	int id;
	String title;
	String describe;
	String location;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String title, String describe, String location) {
		super();
		this.id = id;
		this.title = title;
		this.describe = describe;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", title=" + title + ", describe=" + describe + ", location=" + location + "]";
	}
}
