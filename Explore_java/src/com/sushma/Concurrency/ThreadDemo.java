package com.sushma.Concurrency;

public class ThreadDemo {

	public static void main(String[] args) {
   System.out.println("Default Thread Name :"+Thread.currentThread().getName());
	System.out.println("main thread Priority :"+Thread.currentThread().getPriority());
	System.out.println("Main thread id :"+Thread.currentThread().getId());
	System.out.println(Thread.currentThread().isDaemon());
	System.out.println(Thread.currentThread().getStackTrace());
	System.out.println(Thread.currentThread().getState());
	//System.out.println(Thread.currentThread().countStackFrames());
	System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
     	

}
