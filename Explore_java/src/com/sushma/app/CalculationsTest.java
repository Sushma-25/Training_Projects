package com.sushma.app;

import org.junit.Assert;
import org.junit.Test;



public class CalculationsTest {
	@Test
	void checkAddition() {
   Calculations calc=new Calculations();
   System.out.println(calc.addition(12, 15));
   
 Assert.assertEquals(24, calc.addition(12, 15));
	}
}
