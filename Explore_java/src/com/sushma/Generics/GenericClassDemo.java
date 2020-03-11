package com.sushma.Generics;

public class GenericClassDemo {
public static void main(String[] args) {
	Data intvalue=new Data(90);
	Data city=new Data("bangalore");
	Data boolvalue=new Data(true);
	Data doublevalue=new Data(56.89);
	Data idata=new Data(new info());
}
}
class Data <Sush>{
	Sush value;

	public Data(Sush v) {
		value=v;
		System.out.println("Value : "+value);
	}
	
}
class info
{
	
}