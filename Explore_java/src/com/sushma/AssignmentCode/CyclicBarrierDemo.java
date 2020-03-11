package com.sushma.AssignmentCode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
	new Thread(new MyNewThread(cyclicBarrier)).start();
	new Thread(new MyNewThread(cyclicBarrier)).start(); 
	new Thread(new MyNewThread(cyclicBarrier)).start(); 
	/*new Thread(new MyNewThread(cyclicBarrier)).start(); 
	new Thread(new MyNewThread(cyclicBarrier)).start();
		 */
		
	}

}

class MyNewThread implements Runnable {

	CyclicBarrier cyclicBarrier;

	MyNewThread(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has Entered");
		try {
			Thread.sleep(1000);
            System.out.println(cyclicBarrier.getNumberWaiting());
			System.out.println(cyclicBarrier.await());//await method returns current arrived thread index
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "has been released");
	}

}
