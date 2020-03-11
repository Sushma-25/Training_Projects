package com.sushma.app.Internship;




public class InternshipController {

	void createInternship(String studname, String college, String dept, float totalper) {
		System.out.println("Name of the applied student is " + studname);

		Internship iship = new Internship(studname, college, totalper, dept);
		System.out.println(iship);

		InternService iservice = new InternService();
		iservice.validateInternship(iship);
		System.out.println(iship);
		
		

	}
}
