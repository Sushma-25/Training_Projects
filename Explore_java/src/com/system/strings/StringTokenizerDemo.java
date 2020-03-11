package com.system.strings;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
public static void main(String[] args) {
	String name=args[0];
	//System.out.println(name);
	String[] names=name.split(" ");
	for (String string : names) {
		System.out.println(string);
		
	}
	System.out.println("------------");
	StringTokenizer nameTokens =new StringTokenizer(name," ");
	while (nameTokens.hasMoreTokens())
	{
			System.out.println(nameTokens.nextToken());
		
	}
	
}
}
