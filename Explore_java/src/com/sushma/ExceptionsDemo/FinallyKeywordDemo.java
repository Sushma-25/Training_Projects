package com.sushma.ExceptionsDemo;

import java.io.FileNotFoundException;

public class FinallyKeywordDemo {

	public static void main(String[] args) {
    try {
    	getDetails(1078);
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.exit(0);
   	}
    finally {
		System.out.println("FinallyKeywordDemo.main()");
	}
	}

	private static void getDetails(int value) throws FileNotFoundException {
  System.out.println("FinallyKeywordDemo.getDetails()");	
    if(value>100)
    {
    	throw new FileNotFoundException("Checking");
    }
	}

	
}
