package com.sushma.ExceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompiletimeException {
public static void main(String[] args) {
	File datafile=new File("c:\\Desktop\28-01-2j020.txt");
			try
			{FileReader reader=new FileReader(datafile);
			}
			catch(FileNotFoundException e){
				System.out.println("Looks like file is not there");
				e.getMessage();
			}
			System.out.println("Completed....");
}
}
//SQL server Exception
//Filenotfound esception
