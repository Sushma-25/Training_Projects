package com.sushma.app;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class ProgrammaticExec {
public static void main(String[] args) {
	List<Failure> fails= JUnitCore.runClasses(CalculationsTest.class).getFailures();
	for (Failure failure : fails) {
		
	System.out.println(failure.getMessage());}
   System.out.println("......Failures listed............");}
}
