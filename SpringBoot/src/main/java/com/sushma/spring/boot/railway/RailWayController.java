package com.sushma.spring.boot.railway;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sushma.spring.boot.airport.Airport;


@SpringBootApplication
@ComponentScan(basePackages = {"com.sushma.spring.boot.railway","com.sushma.spring.boot"})
@Controller
public class RailWayController {
     
	@RequestMapping("/getdetails")
	 String getTrainDetails(HttpServletRequest request)
	 {  String type=request.getParameter("traintype");
		 System.out.println("Entered type is "+type);
		 Train train=new Train();
		 if(type.equals("Passenger"))
		 {
			 train.setName("Shatabdi");
			 train.setToCity("Davanagere");
			 train.setFromCity("Bangalore");
             train.setType(type);			 
			 
		 }else
		 {
			 train.setName("Shatabdi34");
			 train.setToCity("Hubli");
			 train.setFromCity("Bangalore");
             train.setType(type);
		 }
		 request.setAttribute("train", train);
		
		return "success";
	 }
	
	@RequestMapping("/getTrainDetails/{type}")
	@ResponseBody
	 Train getTrainDetails(@PathVariable("type")  String types)
	 {  String type=types;
		 System.out.println("Entered type is "+type);
		 Train train=new Train();
		 if(type.equals("Passenger"))
		 {
			 train.setName("Shatabdi");
			 train.setToCity("Davanagere");
			 train.setFromCity("Bangalore");
             train.setType(type);			 
			 
		 }else
		 {
			 train.setName("Shatabdi34");
			 train.setToCity("Hubli");
			 train.setFromCity("Bangalore");
             train.setType(type);
		 }
		
		
		return train;
	 }
	
	@RequestMapping("/getTrainDetail")
	@ResponseBody
	Train getTrainDetail(@RequestParam("typeName") String types)
	 {  String type=types;
		 System.out.println("Entered type is "+type);
		 Train train=new Train();
		 if(type.equals("Passenger"))
		 {
			 train.setName("Shatabdi");
			 train.setToCity("Davanagere");
			 train.setFromCity("Bangalore");
             train.setType(type);			 
			 
		 }else
		 {
			 train.setName("Shatabdi34");
			 train.setToCity("Hubli");
			 train.setFromCity("Bangalore");
             train.setType(type);
		 }
		
		
		return train;
	 }
}
