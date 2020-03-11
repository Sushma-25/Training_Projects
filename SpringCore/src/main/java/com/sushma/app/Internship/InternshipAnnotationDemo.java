package com.sushma.app.Internship;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class InternshipAnnotationDemo {
	public static void main(String[] args) {
		String name = "sagar";
		String college = "MSRIT";
		float percenage = 80.0f;
		String department = "ECE";
		ApplicationContext appContext = new AnnotationConfigApplicationContext(InternConfig.class);
		InternshipController iController = (InternshipController) appContext.getBean(InternshipController.class);
		iController.createInternship(name, college, department, percenage);
	}
}
	@Configuration
	class InternConfig {
		@Bean
		InternshipController getBean() {
			return new InternshipController();
		}
	}

