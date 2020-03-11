package com.sushma.spring.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HostelController {
	@RequestMapping("/getmanager")
	@ResponseBody
	String getManager()
	{
		return " Shiva Sagar ";
	}
	
	
	
	@RequestMapping(value="/hostels" , method=RequestMethod.POST)
	@ResponseBody
	List<Hostel> availableHostel() {
		System.out.println("HostelController.availableHostel()");
		return getHostels();

	}

	private List<Hostel> getHostels() {

		return Arrays.asList(new Hostel(1, "SLN", "Bangalore"), new Hostel(2, "Shri nandi", "Bangalore"),
				new Hostel(3, "Whoopers", "Delhi"));
	}
}
