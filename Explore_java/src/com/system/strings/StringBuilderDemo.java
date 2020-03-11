package com.system.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
   String name="sushma";
   name=name+ " Niranjan";
   name=name+" Talakal";
   StringBuilder sb=new StringBuilder();
   sb.append("sushma");
   System.out.println(sb);
   sb.append(" Niranjan");
   System.out.println(sb);
   sb.append(" Talakal");
   System.out.println(sb);
   
   
   StringBuffer sbuff=new StringBuffer();
   sbuff.append("IBM");
   sbuff.append(" Corporation");
   System.out.println(sbuff);
	}

}
