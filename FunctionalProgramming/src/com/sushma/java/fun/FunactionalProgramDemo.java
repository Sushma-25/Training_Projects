package com.sushma.java.fun;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunactionalProgramDemo {
	public static void main(String[] args) {
		int firstVal = 100;
		int secondVal = 299;

		Function<Integer, Integer> squareIt = num -> num * num;

		Integer sqval = calculateValue(firstVal, squareIt);
		System.out.println(sqval);

		int inputNumber = 5;
		Predicate<Integer> evenPrediction = val -> val % 2 == 0;

		boolean iseven = findNumberType(inputNumber, evenPrediction);
		System.out.println(iseven);
	}

	static boolean findNumberType(Integer num, Predicate<Integer> checkNum)

	{
		return checkNum.test(num);
	}

	private static Integer calculateValue(int firstVal, Function<Integer, Integer> squareIt) {
		return squareIt.apply(firstVal);

	}
}
