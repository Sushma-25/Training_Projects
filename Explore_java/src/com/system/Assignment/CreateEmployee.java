package com.system.Assignment;

public class CreateEmployee {
		int empId;
		String empname;
		String empdept;
		String projectname;
		
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empname=" + empname + ", empdept=" + empdept + ", projectname="
					+ projectname + "]";
		}


		public CreateEmployee(int empId, String empname, String empdept, String projectname) {
			super();
			this.empId = empId;
			this.empname = empname;
			this.empdept = empdept;
			this.projectname = projectname;
		}
		
	


}
