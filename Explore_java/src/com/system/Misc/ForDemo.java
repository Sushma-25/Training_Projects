package com.system.Misc;

import java.util.Iterator;

public class ForDemo {

	public static void main(String[] args) {
   
      for (int i = 0; i < 2; i++) {//more control
		String string = args[i];
		System.out.println(string);
	}
     System.out.println(".....................\n");
      for (String string : args) {
    	  System.out.println(string);
	}
	}

}
