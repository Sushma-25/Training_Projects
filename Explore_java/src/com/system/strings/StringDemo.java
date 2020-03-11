package com.system.strings;

public class StringDemo {
public static void main(String[] args) {
	String name="IBM";
	System.out.println(name);
	name=name+" Corp";
	System.out.println(name);
	String myName="Sushma Talakal";
	String fullname=new String("Sushma Talakal");
	System.out.println(myName==fullname);if(myName.equals(fullname))
	{
		System.out.println("YES");
	}else
	{
		System.out.println("No");
	}
}
}
