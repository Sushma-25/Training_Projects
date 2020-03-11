package com.sushma.app;

import java.util.HashMap;
import java.util.Map;

public class Employeeops {
	Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public int getEmployee() {

		System.out.println(empMap.size());
		return empMap.size();
	}

	public void createEmployee(Employee emp) {
		empMap.put((int) (Math.random()*1000), emp);
	}

}
