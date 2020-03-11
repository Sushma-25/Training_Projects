package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppraisalController {
	
	@Autowired
	RestTemplate template; 
	
	@RequestMapping("/appraisal/{eid}")
	Employee getAppraisalInfo(@PathVariable("eid") int empId) {
		Employee emp = getEmployee(empId);

		
		// to retrieve data from employee ratings web page (ratings web service)
		ResponseEntity<StandardRatings[]> out = template.getForEntity("http://RATINGS-SERVICE/ratings",
				StandardRatings[].class);
		StandardRatings[] rateArray = out.getBody();
		List<StandardRatings> ratingsList = Arrays.asList(rateArray);
		Map<Integer, String> ratingDataMap = ratingsMap(ratingsList);

		// To get data from empRating web page with 4 values
		ResponseEntity<Integer[]> empRatingRes = template.getForEntity("http://EMP-RATING-SERVICE/empRatings/" + empId,
				Integer[].class);
		Integer[] empRatingArray = empRatingRes.getBody();
		List<Integer> empRatingList = Arrays.asList(empRatingArray); // convert Integer array to list

		int ratingCounter = 0;
		String[] empAppraisalRatings = new String[4]; // each index represents quarter of year

		// Mapping rating number of passed employee id to rating name
		for (Integer rating : empRatingList) {
			empAppraisalRatings[ratingCounter++] = ratingDataMap.get(rating);
		}

		// Set appraisal ratings list
		emp.setAppraisalRatings(empAppraisalRatings);

		return emp;
	}
	
	//Method to assign list values to hashmap

	Map<Integer, String> ratingsMap(List<StandardRatings> ratinglist) {
		Map<Integer, String> h = new HashMap<Integer, String>();
		for (StandardRatings standardRatings : ratinglist) {
			h.put(standardRatings.getId(), standardRatings.getName());
		}
		return h;

	}

	// MEthod to set
	private Employee getEmployee(int empId) {
		Employee emp = new Employee();
		if (empId == 1) {
			emp.setId(empId);
			emp.setName("Sushma");

		} else {
			emp.setId(empId);
			emp.setName("swati");
		}
		return emp;
	}

}
