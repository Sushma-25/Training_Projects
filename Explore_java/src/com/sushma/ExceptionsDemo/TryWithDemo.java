package com.sushma.ExceptionsDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithDemo {

	public static void main(String[] args) throws IOException {
		
		     File datafile=new File("C:\\sushma workspace\\newf7le.txt");
		    try(BufferedReader breader=new BufferedReader(new FileReader(datafile));) {
		    	
		    
		     String data;
		     System.out.println("Reading line one by one");
		     while ((data=breader.readLine())!=null) {
				System.out.println(data);
			}
		     
		    }catch (IOException e) {
				System.out.println(e.getMessage());
			}
		    /*catch (FileNotFoundException|IOException e) {
			}
*/
}}













