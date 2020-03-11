package com.system.apie;

public class InheritanceDemo {

	public static void main(String[] args) {

	Calc ca=new Calc();
	ca.add(2,9);
	}

}
class Calc extends ScintificCalculation
{
	
}
class StdCalculation
{
	void add(int f,int s) {
	int k;
	k=f+s;
	System.out.println("sum is "+ k);
}}

class ScintificCalculation
{
	void add(int f,int s) {
	int k;
	k=f+s+s;
	System.out.println("sum is "+ k);
}}

