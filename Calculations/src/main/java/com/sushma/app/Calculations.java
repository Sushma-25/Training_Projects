package com.sushma.app;

public class Calculations {
	int addition(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

	int multiply(int i, int j) {
		return i * j;
	}

	double division(double i, double j) {
		if (j == 0) {
			throw new ArithmeticException();
		}
		return i / j;

	}

	 int substraction(int i, int j) {
		return i-j;
	}

}
