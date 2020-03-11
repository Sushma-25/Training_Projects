package com.sushma.spring.web;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
	EmployeeService service;
	
	@RequestMapping("/")
	  String HomePage()
	  {
    	  System.out.println("Display home jsp.......");
    	  return "employee"; 
		  
		  
	  }

  @RequestMapping("/DisplayEmployee")
   ModelAndView getEmployee() throws ClassNotFoundException, SQLException{
	   ModelAndView mav=new ModelAndView("empdata");
	   
	  List<Employee> emplist=service.getEmployees();
	  
	  System.out.println(emplist);
	  Map<String , Object> datamap=new HashMap<>();
	  datamap.put("emps",emplist);
	  mav.addAllObjects(datamap);
	   
	   return mav;
   }
}