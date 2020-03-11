package com.system.classes;

public class Employee {
	int empId;
	String empname;
	String empdept;
	String projectname;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empdept=" + empdept + ", projectname="
				+ projectname + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	

}
