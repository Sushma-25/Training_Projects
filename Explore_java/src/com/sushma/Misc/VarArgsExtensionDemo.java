package com.sushma.Misc;

import java.util.List;

public class VarArgsExtensionDemo {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Cities city=new Cities();
	String ck;
	city.addNames(4323,"Bangalore","Davanagere","Mangalore" );
	city.addCities("Bangalore","Davanagere","Mangalore");
	@SuppressWarnings("rawtypes")
	List l;
}
}
class Cities{
	void addCities(String... cityName)
	{//The passsed values 
		for (String string : cityName) {
			System.out.println("City Name :"+string);
			
		}
	}
	void addNames(int k,String... names )
	{ 
		for (String string : names) {
			System.out.println("Name:"+string);
		}
	}
}
//Variable arguments are used when similar arguments are to b passed and you dont do the ount