package com.system.functions;

public  class Calculation {
 public static int addition(int first,int last)
 {
	 return first+last;
 }
 protected final int substraction(int first,int last)
 {
	 return first-last;
 } 
 int multiplication(int first,int last)
 {
	 return first*last;
 }
 private synchronized int division(int first,int last)
 {
	 return first/last;
 }
 private native int exponent(int f ,int s);
 //private abstract int expt(int f ,int s);
 
}
