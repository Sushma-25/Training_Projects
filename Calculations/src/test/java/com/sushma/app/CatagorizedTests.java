package com.sushma.app;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@IncludeCategory({Positive.class,Negative.class})
//@ExcludeCategory(Positive.class)
@SuiteClasses({CalculationsTest.class,PasswordTest.class,EmployeeopsTest.class})
public class CatagorizedTests {

}
interface Positive{
	
}
interface Negative{
	
}
interface Exceptional{
	
}