/**
 * 
 */
package com.system.Misc;

/**
 * @author SushmaTN
 *
 */
public class ThisMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  Computer lenovo=new Computer("Lenovo","Thinkpad",(byte)45);
  System.out.println(lenovo);
	}

}

class Computer
{
	String manufacturer;
	String model;
	byte ram;
		
	public Computer()
	{
		
	}

	public Computer(String manufacturer, String model) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Computer(String manufacturer, String model, byte ram) {
		this(manufacturer,model);
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}
	
	
}