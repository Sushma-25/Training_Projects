package com.sushma.app;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CalculationsTest {
	static Calculations calc;

	@BeforeClass
	public static void InitClass() {
		System.out.println("CalculationsTest.InitClass()");
		calc = new Calculations();
	}

	@Before
	public void beforeEachMEehod() {
		System.out.println("CalculationsTest.beforeEachMEehod()");
	}

	/*
	 * @After public void afterEachMethod() {
	 * System.out.println("CalculationsTest.afterEachMethod()"); }
	 */
	@Category(Positive.class)
	@Test
	public void checkAddition() {
		System.out.println("CalculationsTest.checkAddition()");
		// System.out.println(calc.addition(12, 15));

		Assert.assertEquals(27, calc.addition(12, 15));
	}

	@Test
	public void checkMultiplication() {
		System.out.println("CalculationsTest.checkMultiplication()");
		Assert.assertEquals(200, calc.multiply(10, 20));

	}

	@Category(Positive.class)
	@Test
	public void checkDivision() {
		System.out.println("CalculationsTest.CheckDivision()");
		Assert.assertEquals(3.13, calc.division(20, 6), 4);
	}

	@Test(expected = ArithmeticException.class)
	public void checkDivisionWithException() {
		Assert.assertEquals(0.0, calc.division(20, 0));
	}

	@Test
	@Ignore
	public void checkSubstraction() {
		Assert.assertEquals(8, calc.substraction(20, 12));
	}

	@Category(Negative.class)
	@Test
	public void checksubstractionNegativeValue() {
		assertEquals(-8, calc.substraction(12, 20));
	}
}
