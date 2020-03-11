package com.sushma.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
      File inforfile=new File("C:\\sushma workspace\\newfile.txt");
      FileWriter writer=new FileWriter(inforfile);
      System.out.println("About to write contents to file");
      writer.write("IBM Corporation");
      writer.write("\nsushma niranjan talakal");
      writer.close();
	}

}
