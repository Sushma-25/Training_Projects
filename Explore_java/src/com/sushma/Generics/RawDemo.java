package com.sushma.Generics;

import java.util.ArrayList;
import java.util.List;

public class RawDemo {

	public static void main(String[] args) {
       List<String> cities;
       List<Boolean> cards;
       List<Double> taxes;
       
       List values=new ArrayList<>();
         values.add(12);
         values.add(true);
         values.add("IBM");
         System.out.println(values);
         List<Integer> numbers=new ArrayList<Integer>();
        // numbers.add(false);
         numbers.add(23);
        // numbers.add("jshd");
         System.out.println(numbers);
	}

}
