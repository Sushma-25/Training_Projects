package com.sushma.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParametarizedTests {
@Parameter(0)
public int first;
@Parameter(1)
public int second;

@Parameter(2)
public int sum;

@Test
public void testAddition() {
	Calculations calc=new Calculations();
	Assert.assertEquals(sum, calc.addition(first, second));
}
@Parameters
public static Collection<Object[]> data() {
	return Arrays.asList(new Object[][] { {12,13,25},{22,37,50}});
	
}
}
