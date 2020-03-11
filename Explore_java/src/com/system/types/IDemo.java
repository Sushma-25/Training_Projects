package com.system.types;

public class IDemo {
public static void main(String[] args) {
	
	HpPrinter hp=new HpPrinter();
	System.out.println("hp can print photos");
	CanonPrinter canon=new CanonPrinter();
	System.out.println("Canon can print photos");
	Printable p=new CanonPrinter();
	p=new HpPrinter();
	//Anonymous class-After this class is executed memory will be
	//that was allocated before
	Printable another=new  Printable() {
		
		@Override
		public boolean canPrintPhotos() {
			System.out.println("IDemo.main(...).new Printable() {...}.canPrintPhotos()");
			return true;
		}
	};
	System.out.println(another.canPrintPhotos());
}
}
