package com.sushma.Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterDemo {

	public static void main(String[] args) {
		new Thread(new PayrollProcess()).start();
		  ExecutorService exService=Executors.newFixedThreadPool(5);
		  exService.execute(new PayrollProcess());
		  exService.execute(new PayrollProcess());
		
		 

	}

}
class PayrollProcess implements Runnable
{@Override
	public void run() {
   System.out.println("Processing salary........");		
	}
	
}
