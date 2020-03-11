package com.sushma.spring.boot.airport;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = {"com.sushma.spring.boot.airport","com.sushma.spring.boot"})
public class AirportController {
  
	@RequestMapping("/fetchairport")
	String getAirportDetails(HttpServletRequest req)
	{
	String cityName= req.getParameter("reqCity");
	  System.out.println("Entered city name "+cityName);
		
	  
	  Airport airport=new Airport();
	  if(cityName.equals("bangalore"))
	  {
		  airport.setId(222);
		  airport.setName("Kempe Gowda Interntional airport");
		  airport.setState("Karnataka");
		  airport.setCity("Bangalore");
	  }else
	  {
		  airport.setId(444);
		  airport.setName("Indira Ghandi International Airport");
		  airport.setState("Delhi");
		  airport.setCity("New Delhi");
	  }
	  req.setAttribute("ap",airport);
	  return "details";
	}

	@ResponseBody
	/*
	 *  * 
	 * @RequestMapping("/getairportdata/{city}") Airport
	 * getAirportDetails(@PathVariable("city") String name) //Setting path variable
	//Setting path variable
	//to pass data to getAirportDetails web service the URL format is http://localhost:9090/getairportdata/banaglore*/
    @RequestMapping("/getAirportData")
	Airport getAirportDetails(@RequestParam("cityName") String name)  //Using request parameter
	//URL format is http://localhost:9090/getAirportData?cityName=bangalore
	{
	String cityName=name;
	  System.out.println("Entered city name "+cityName);
		
	  
	  Airport airport=new Airport();
	  if(cityName.equals("bangalore"))
	  {
		  airport.setId(222);
		  airport.setName("Kempe Gowda Interntional airport");
		  airport.setState("Karnataka");
		  airport.setCity("Bangalore");
	  }else
	  {
		  airport.setId(444);
		  airport.setName("Indira Ghandi International Airport");
		  airport.setState("Delhi");
		  airport.setCity("New Delhi");
	  }
	 
	  return airport;
	}
}
