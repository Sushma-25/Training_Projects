package com.sushma.Misc;

public class VarArgsDemo {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("Sum is :" + calc.sum(45, 32, 89,78));
	}

}

class Calc {
	int sum(int... inputArgs)
	{System.out.println("Arguments");
	int sum=0;
	for (int i : inputArgs) {
		sum=sum+i;
		
	}
	
		return sum;
	}

	
	/*
	 * int sum(int first, int second) { return first + second; }
	 */  
	  public int sum(int i, int j, int k) { // TODO Auto-generated method stub
	System.out.println("HEre it is"); 
	return i+j+k; }
	 
}