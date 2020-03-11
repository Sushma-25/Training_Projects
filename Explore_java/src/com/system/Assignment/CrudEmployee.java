package com.system.Assignment;


import java.util.Arrays;
import java.util.Scanner;

public class CrudEmployee {
	static int n = 0;
	static CreateEmployee c[] = new CreateEmployee[n];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int id;
		String name, dept, projectname;
		while (true) {
			System.out.println("Enter \n 1:Create Employee \n 2: Retrieve Employee\n 3:Update Employee\n "
					+ "4:Delete Employee\n  q:Quit");
			int l=s.nextInt();
			switch (l) {
			case 1:
				System.out.println("Please enter number of Employees");
				int currentinput = s.nextInt();
				
				CreateEmployee current[] = new CreateEmployee[currentinput];
                	for (int i = 0; i < currentinput; i++) {
					//System.out.println("i:"+i+"n "+n);
					System.out.println("Enter ID :");
					id = s.nextInt();
					System.out.println("Enter Name :");
					name = s.next();
					System.out.println("Enter Dept :");
					dept = s.next();
					System.out.println("Enter Project:");
					projectname = s.next();
					CreateEmployee k = new CreateEmployee(id, name, dept, projectname);
					current[i] = k;

				}
                	int prev=n;
                n=n+currentinput;
				System.out.println("Done\n");
				  for (int i = 0,j=prev; i < currentinput&&j<n; i++,j++) {
			            c[j]= current[i];// increment by +1
			        }

				break;
			case 2:
				System.out.println("List of Current Employees\n");
				for (int i = 0; i < n; i++) {
					System.out.println("No " + (i + 1)+" : ");
					System.out.println(c[i]);
				}
				break;
			case 3:
                int input;
                System.out.println("Enter the employee id to update");
                input=s.nextInt();
                for (int i = 0; i < n; i++) {
					if(input==c[i].empId)
					{ System.out.println("Select Field to update\n 1:Dept\n 2:Project\n");
					int key=s.nextInt();
					switch (key) {
					case 1:
						System.out.println("Enter new value to update");
						c[i].empdept=s.next();
											
						break;
					case 2:
						System.out.println("Enter new value to update");
						c[i].projectname=s.next();
								
						break;
					default:
						break;
					}
					break;
					}
				}
				break;
			case 4:
				int inputid;
				System.out.println("Enter Employee id to delete");
               inputid=s.nextInt();
               int i;
               for (i = 0; i < n; i++) {
				if(inputid==c[i].empId)
				{
					break;
				}
			}
               for(int k=i;k<n-1;k++)
                c[k]=c[k+1];
               
               n=n-1;
               System.out.println("Done\n");
				break;

			case 5:
				System.exit(0);
				break;
			}
		}
		

	}

}
/*
 * System.out.println("List of Current Employees"); for(int i=0;i<n;i++) {
 * System.out.println("Serial No"+(i+1)); System.out.println("Emp ID: "+c.); }
 */