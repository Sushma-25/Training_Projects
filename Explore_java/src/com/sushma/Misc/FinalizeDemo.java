package com.sushma.Misc;

public class FinalizeDemo {

	public static void main(String[] args) {
    
		Datails d=new Datails();
		System.out.println(d);
		d=null;
		System.out.println(d);
		//Runtime.getRuntime().gc();
       System.gc();
		System.out.println("Done!!!!");
	}

}
class Datails extends Object
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Data object memory getting collected by JVM");
	}
}