package com.sushma.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
   ExecutorService eservice=Executors.newSingleThreadExecutor();
   Future<String> threadReturnValue=eservice.submit(new CountExecutions());
	System.out.println(".....Started.....");
   System.out.println(threadReturnValue.get());
	Thread.sleep(10000);
   System.out.println("Done !!!");
   
	}

}
class CountExecutions implements Callable<String>
{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Redhat # IBM";
	}
	
}

/*
 * class CountExecutions implements Callable<Integer> {
 * 
 * @Override public Integer call() throws Exception { return null; }
 * 
 * }
 */
class ProcessQuery implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}