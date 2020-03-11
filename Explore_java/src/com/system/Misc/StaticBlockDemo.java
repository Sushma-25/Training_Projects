package com.system.Misc;

public class StaticBlockDemo {
public static void main(String[] args) {
	new Corporate();
	 /*Corporate c=new Corporate();
	Corporate c1=new Corporate();
	Corporate c2=new Corporate();
	Corporate c3=new Corporate();*/
}
}
class Corporate
{  static
	{
	System.out.println("Corporate ,static block");
	}

	
	public Corporate() {
		System.out.println("Corporate.Corporate()");
	}
	{
		System.out.println("Corporate object Creation ......");
	}
	
}
