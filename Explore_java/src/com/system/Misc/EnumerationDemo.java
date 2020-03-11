package com.system.Misc;

public class EnumerationDemo {

	public static void main(String[] args) {
		String inputday=args[0];
		System.out.println("Entered Day : "+inputday);
		
		Days convertedinput=mappingDaysToEnums(inputday);
		System.out.println("Converted Input : "+convertedinput);//Days day1=Days.SUNDAY;
			switch (convertedinput) {
			case MONDAY:
				System.out.println("Working Day");
				break;
			case TUESDAY:
				System.out.println("Working Day");
				break;
			case WEDNESDAY:
				System.out.println("Working Day");
				break;
			case THURSDAY:
				System.out.println("Working Day");
				break;
			case FRIDAY:
				System.out.println("Working Day");
				break;
			case SATURDAY:
				System.out.println("Holiday");
				break;
			case SUNDAY:
				System.out.println("Holiday");
				break;
			default:
				break;
			}

	}

	private static Days mappingDaysToEnums(String day) {
	     Days days = null;
		String key=day.toLowerCase();
		switch (key) {
		case "fri":
			 days=Days.FRIDAY;
			break;
		case "mon":
			days=Days.MONDAY;
			break;
		case "sun":
			days=Days.SUNDAY;
		default:
			break;
			
		}
	
	
	return days;
	}

}
 enum Days
 {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
 }
