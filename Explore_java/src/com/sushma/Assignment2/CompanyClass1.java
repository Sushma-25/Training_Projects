package com.sushma.Assignment2;

public class CompanyClass1 {
   String Companyid,location,name,founder;

   
  


public CompanyClass1() {
	super();
	// TODO Auto-generated constructor stub
}



public String getCompanyid() {
	return Companyid;
}





public String getLocation() {
	return location;
}



public void setLocation(String location) {
	this.location = location;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getFounder() {
	return founder;
}



public void setFounder(String founder) {
	this.founder = founder;
}



@Override
public String toString() {
	return "CompanyClass [Companyid=" + Companyid + ", location=" + location + ", name=" + name + ", founder=" + founder
			+ "]";
}



public void setCompanyid(String companyid2) {
	Companyid = companyid2;	
}






   
}
