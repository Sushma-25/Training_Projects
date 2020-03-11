package com.sushma.app.restaurant;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestaurantController {
	@RequestMapping("/createRest")
	String insertRestaurant() {
		System.out.println("would like to create restaurant !!");
		return "home";
	}

	@RequestMapping(value = "createRestaurant", method = RequestMethod.POST)
	ModelAndView createNewRestaurant(HttpServletRequest request) {
		String name = request.getParameter("rname");
		String location = request.getParameter("rlocation");
		String cuisine = request.getParameter("rcuisine");
        
		Restaurant res=new Restaurant(name, location, cuisine);
				System.out.println("RestaurantController.createNewRestaurant()" + name + " " + location + " " + cuisine);
		ModelAndView mv = new ModelAndView("success");
		Map<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("abc", "kjnewk");
		hmap.put("xyz", "8475");
		hmap.put("resinput",res);
		mv.addAllObjects(hmap);
		return mv;
	}

}
