package com.sushma.Concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

	 static BlockingQueue<Integer> blockqueue=new ArrayBlockingQueue<Integer>(5);
	public static void main(String[] args) {
		
 
  Producer prod=new Producer(blockqueue);
  for (int i = 0; i < 5; i++) {
	  new Thread(prod).start();
}
 
 // new Thread(new Producer()).start();
 
		
		  for(int i=0;i<5;i++)
		  {
			  new Thread(new Consumer(blockqueue)).start();
		  }
		 
}}
class Producer implements Runnable
{
	BlockingQueue<Integer> bqpruduc;
	public Producer(BlockingQueue<Integer> blockingQueue) {
   bqpruduc=blockingQueue;

    }

	@Override
	public void run() {
		int prodValue=new Random().nextInt(10000);
		bqpruduc.add(prodValue);
		System.out.printf("Produced (%d) Queue size (%d) Thread (%s)\n",prodValue,bqpruduc.size(),Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Consumer implements Runnable
{
	BlockingQueue<Integer> bqpruduc;

	public Consumer(BlockingQueue<Integer> blockqueue) {
		 bqpruduc=blockqueue;
		   
	}

	@Override
	public void run() {
		int conValue;
		try {
			conValue = bqpruduc.take();
			System.out.printf("Consumed (%d) Queue size(%d) Thread(%s) \n",conValue,bqpruduc.size(),Thread.currentThread().getName());
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println("Consumer got interrupted.");
		}
		
	}
	
}