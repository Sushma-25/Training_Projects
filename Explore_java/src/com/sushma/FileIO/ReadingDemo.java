package com.sushma.FileIO;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDemo {

	//@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
     File datafile=new File("C:\\sushma workspace\\newfile.txt");
     BufferedReader breader=new BufferedReader(new FileReader(datafile));
     String data;
     System.out.println("Reading line one by one");
     while ((data=breader.readLine())!=null) {
		System.out.println(data);
	}
     
     
     System.out.println("\n...............\n");
     Scanner datascan=new Scanner(datafile);
   //  String rawdata;
     while (datascan.hasNextLine()) {
		System.out.println( datascan.nextLine());
		
	}
     datascan.close();
     
     System.out.println("\n..............\n");
     FileReader fReader=new FileReader(datafile);
     int retchar;
     while ((retchar=fReader.read())!= -1) {
    	 System.out.println((char)retchar);
		
	}
     //fReader.close();
	}

}
