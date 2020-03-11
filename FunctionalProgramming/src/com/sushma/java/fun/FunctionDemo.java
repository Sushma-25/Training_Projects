package com.sushma.java.fun;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> addfun = f -> f * f;
		System.out.println(addfun.apply(5));
			
		
		//Anonymous class
		Function<Integer, Integer> checkfun = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		System.out.println(checkfun.apply(5));
		
		
		
		//Using lambda expressions
		Function<Integer, Integer> checkmul = t-> t*t ;
		System.out.println(checkmul.apply(5));
		
	}
}
