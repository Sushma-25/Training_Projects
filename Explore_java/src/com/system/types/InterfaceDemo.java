package com.system.types;

public class InterfaceDemo {

	public static void main(String[] args) {
		Validate v=new Validate();
		v.validation();
	}
	
}
class Validate implements HardwareValidation,SoftwareValidation
{

	@Override
	public boolean validation() {
		System.out.println("Validate.validation()");
		return false;
	}


}
interface HardwareValidation{
	boolean validation();
	
}
interface SoftwareValidation{
	boolean validation();
	
}

/*it is class where methods should be abstract
 * Interface should have function declaration and the implmentation must
 * be done in child class
 * variables must be intialized in interface
 *Below shown is how methods and variables should be declared,If user not mentioned
 *it will be added by compiler automatically (To check it go to cmd prompt mention path then give javap interface_name
 * two interfaces can have same methods with single child class
 *  public static final int g;
  public abstract int add(int, int);
  Interface extends interface
  
 */
