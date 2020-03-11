package com.system.memory;

public class HeapMemoryDemo {

	public static void main(String[] args) {
  System.out.println("Allocating more memory");
  long[] l=new long[100000*10000];
  System.out.println("Done");
	}

}
