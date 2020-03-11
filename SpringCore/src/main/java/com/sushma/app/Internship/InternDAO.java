package com.sushma.app.Internship;

public class InternDAO {

	void generateInternshipId(Internship internshipobj)
	{  System.out.println("Generating the intern id");
		internshipobj.setId((int)(Math.random()*1000));
	}
}
