package com.system.functions;

public class FinalMethodName {
	static final int value=100;
public static void main(String[] args) {
	System.out.println(value);
	//value=200;
	System.out.println(value);
}
}
class Data{
	void stdData()
	{
		System.out.println("Data.stdData()");
	}
	final void splData()//final method cannot be overridden
	{
		System.out.println("Data.splData()");
	}
}
class CompanyData extends Data{
	@Override
	void stdData() {
		// TODO Auto-generated method stub
		super.stdData();
	}
	
	
}
