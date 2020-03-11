package com.sushma.app.restaurant;
//Base configuration file
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class restaurantConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("restaurantConfig.getRootConfigClasses()");
		return null;
	}

	@Override                         
	protected Class<?>[] getServletConfigClasses() {//informs about servlet classes
		System.out.println("restaurantConfig.getServletConfigClasses()");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("restaurantConfig.getServletMappings()");
		return new String[] {"/"};
	//anything after / is managed by spring
		}

}
