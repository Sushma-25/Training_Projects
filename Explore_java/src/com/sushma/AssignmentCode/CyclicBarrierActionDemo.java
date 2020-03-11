package com.sushma.AssignmentCode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierActionDemo {
	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new CyclicBarrrierEvent());
		new Thread(new MyThreaad(cyclicBarrier)).start();
		new Thread(new MyThreaad(cyclicBarrier)).start();
		new Thread(new MyThreaad(cyclicBarrier)).start();
		new Thread(new MyThreaad(cyclicBarrier)).start();
		new Thread(new MyThreaad(cyclicBarrier)).start();
		new Thread(new MyThreaad(cyclicBarrier)).start();
		
	}

}

class MyThreaad implements Runnable {

	CyclicBarrier cyclicBarrier;

	MyThreaad(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " has Entered");
			try {
			Thread.sleep(1000);
			System.out.println(cyclicBarrier.await());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " has been released");
	}

}

class CyclicBarrrierEvent implements Runnable {

	public void run() {
		System.out.println("CyclicBarrrierEvent has been triggered\n");
	}

}

