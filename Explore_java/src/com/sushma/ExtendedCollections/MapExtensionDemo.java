package com.sushma.ExtendedCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExtensionDemo {

	public static void main(String[] args) {
      Map<Integer, String> citymap=new HashMap<Integer,String>();
      citymap.put(111,"Bangalore");
      citymap.put(222, "Chennai");
      citymap.put(333, "Delhi");
      citymap.put(333,"Mangalore");
      System.out.println(citymap);
      System.out.println(citymap.keySet());
      System.out.println(citymap.values());
	}

}
