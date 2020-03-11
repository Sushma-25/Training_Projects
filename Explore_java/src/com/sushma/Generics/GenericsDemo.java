package com.sushma.Generics;

public class GenericsDemo {

	public static void main(String[] args) {
		add(4,5);
		add(12.4f,67.8f);
		add(12.5,23.45);
		System.out.println("\n.....................\n");
		display(new Integer(4),5);
		display(12.4f,67.8f);
		display(12.5,23.45);
       
	}

	static <T> void display(T Tone,T Ttwo) {
     System.out.println(Tone);
     System.out.println(Ttwo);
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
