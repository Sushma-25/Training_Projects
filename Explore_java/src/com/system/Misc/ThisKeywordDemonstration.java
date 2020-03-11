package com.system.Misc;

public class ThisKeywordDemonstration {
    int count;
	public static void main(String[] args) {
		ThisKeywordDemonstration td=new ThisKeywordDemonstration();
		td.process();
 }
	private   void setCount(int count) {
		this.count = count;
	}
	void process()
	{
		  System.out.println("Count Vlaue : "+count);
		  setCount(148);
		 System.out.println("Updated Count : "+ count);
	}

}
