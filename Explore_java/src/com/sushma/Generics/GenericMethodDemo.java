package com.sushma.Generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
      sum(10,20);
      //sum("IBM ","Bangalore");
      sum(25.5,34.5);
      Integer i;
      Double d;
      String s;
	Boolean b;
	}
	private static<F extends Number,S extends Number> void sum(F firstvalue,S secondvalue) {
  		  System.out.println(firstvalue.intValue()+secondvalue.intValue());
  		System.out.println(firstvalue.doubleValue()+secondvalue.doubleValue());
  		System.out.println(firstvalue.longValue()+secondvalue.longValue());
  		
  		if(firstvalue.getClass()==Integer.class)
  		{
  			System.out.println(firstvalue.intValue()+secondvalue.intValue());
  		}else
  		{
  			System.out.println(firstvalue.doubleValue()+secondvalue.doubleValue());
  		}
	}
	private static void add(double d, double e) {
		System.out.println(d+e);		
			}

			private static void add(float f, float g) {
		System.out.println(f+g);		
			}

			private static void add(int i, int j) {
		System.out.println(i+j);		
			}

}
