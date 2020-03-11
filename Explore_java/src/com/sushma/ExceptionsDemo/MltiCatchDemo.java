package com.sushma.ExceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MltiCatchDemo {

	public static void main(String[] args) {
		try{
		DriverManager.getConnection(" ").createStatement().executeQuery(" ");
		File inforfile=new File("C:\\sushma workspace\\newfile.txt");
		FileReader read=new FileReader(inforfile);
		
	}catch(SQLException|FileNotFoundException s)
		{System.out.println(s.getMessage()+" "+s.getClass());
		}
		
		}

}
