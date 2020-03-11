package com.system.apie;

public class PolymorphismDemo {

	public static void main(String[] args) {

		CompoundInterestCalc i=new CompoundInterestCalc();///parent reference child access
	i.calculate(89);
	}

}
class CompoundInterestCalc extends  InterestCalc
{
	@Override
	void calculate(int p) {
		System.out.println("CompoundInterestCalc.calculate()");
	}
}
class InterestCalc
{
	void calculate(int p)
	{
		System.out.println("InterestCalc.calculate()");
	}
	
}
