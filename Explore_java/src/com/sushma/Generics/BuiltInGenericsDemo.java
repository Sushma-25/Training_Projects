package com.sushma.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BuiltInGenericsDemo {

	public static void main(String[] args) {
        List<String> cities=new ArrayList<String>();
        cities.add("Bangalore");
        cities.add("davanagere");
        
        for (String string : cities) {  //list has strings as objects
			System.out.println(string);
		}
        
        System.out.println("\n...................\n");
        List countries=Arrays.asList("India","America","Nepal");
        for (Object object : countries) { //countries are taken as objects
			System.out.println(object);
		}
        Set<Integer> s;
        Map<Integer, String> m;
	}

}
