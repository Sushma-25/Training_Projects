package com.sushma.app.Internship;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class InternshipXMLDemo {

	public static void main(String[] args) {

		String name = "sushma";
		String college = "RVCE";
		float percenage = 80.0f;
		String department = "CSE";
		/*
		 * Internship sushma= new Internship("sushma", "RVCE", 80.0f, "CSE");
		 * System.out.println(sushma);
		 */
	//	InternshipController iController = new InternshipController();
		@SuppressWarnings("deprecation")
		BeanFactory bFactory=new XmlBeanFactory(new ClassPathResource("interns.xml"));
		InternshipController iController=(InternshipController) bFactory.getBean("controller");
		iController.createInternship(name, college, department, percenage);
	}

}
