package com.sushma.app.Internship;

public class InternService {
	void validateInternship(Internship internobj) {
		System.out.println("Checking the internship aspirant percentage");
		if (internobj.getPercentage() > 75) {
			internobj.setSelected(true);

			InternDAO iDAO = new InternDAO();
			iDAO.generateInternshipId(internobj);
		} else
			internobj.setSelected(false);
	}
}
