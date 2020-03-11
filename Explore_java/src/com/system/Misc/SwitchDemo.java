package com.system.Misc;

public class SwitchDemo {

	public static void main(String[] args) {
      //int day=7;
	
      String day=args[0];
		switch (day.toUpperCase()) {
		case "MON":
			System.out.println("Working Day");
			break;
		case "TUE":
			System.out.println("Working Day");
			break;
		case "WED":
			System.out.println("Working Day");
			break;
		case "THU":
			System.out.println("Working Day");
			break;
		case "FRI":
			System.out.println("Working Day");
			break;
		case "SAT":
			System.out.println("Holiday");
			break;
		case "SUN":
			System.out.println("Holiday");
			break;
		default:
			break;
		}
	}

}
