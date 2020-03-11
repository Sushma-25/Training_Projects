package com.sushma.spring.web;


import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;


@Qualifier("mongo")
@Repository
public class MongoDAO  implements EmployeeDAO{


	@Override
	public List<Employee> getEmployeeData() {
       
		MongoTemplate template =new MongoTemplate(MongoDbFactory());

		MongoCollection<Document> empdocs = template.getCollection("Employee");
		System.out.println(empdocs.countDocuments());
        
		
		List<Employee> emplist = template.findAll(Employee.class, "Employee");
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
		return emplist;
	}

	
	private MongoDbFactory MongoDbFactory() {

		return new SimpleMongoDbFactory(new MongoClient("localhost"), "ibm");
	}
}
