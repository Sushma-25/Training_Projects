package com.sushma.Misc
import java.util.List;

public class CheckComposition {
	public static void main(String[] args) {
		Company com = new Company();
		com.id = 111;
		com.name = "Microsoft";

		Department hrdept = new Department();
		hrdept.deptHead = "Prasanna";
		hrdept.deptLocation = "Bangalore";
		hrdept.deptName = "HR";

		
		
		Contact con=new Contact();
		con.contactNumber="99999999";
		con.contactType="Mobile";
		
		hrdept.deptContact=con;
		
		com.dept = hrdept;
	}
}

/*
 * company:{id:c1
 * 
 * name:ibm
 * 
 * dept:{ deptName:"Learning and Development"
 * 
 * deptHead:"Biprojit Roy"
 * 
 * deptLocation:"Manyata";
 * 
 * deptContact:{ contactNumber:99999999999;
 * 
 * contactType:"Landphone"; } } }
 */

class Company {
	int id;
	String name;
	Department dept;

}

class Department {
	String deptName;
	String deptHead;
	String deptLocation;

	Contact deptContact;

}

class Contact {
	String contactNumber;
	String contactType;
}