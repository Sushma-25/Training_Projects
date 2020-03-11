package com.sushma.spring.mongo;

import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

public class AccessMongoData {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
		MongoTemplate template = context.getBean(MongoTemplate.class);

		MongoCollection<Document> empdocs = template.getCollection("Employee");
		System.out.println(empdocs.countDocuments());
        
		
		template.insert(new Employee("sumihxud","ABC","XYZ"),"Employee");
		
		List<Employee> emplist = template.findAll(Employee.class, "Employee");
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
		
	}
}

@Configuration
class MongoConfig {

	@Bean
	MongoTemplate template() {
		MongoTemplate mt = new MongoTemplate(MongoDbFactory());
		return mt;
	}

	@SuppressWarnings("deprecation")
	private MongoDbFactory MongoDbFactory() {

		return new SimpleMongoDbFactory(new MongoClient("localhost"), "ibm");
	}
}
