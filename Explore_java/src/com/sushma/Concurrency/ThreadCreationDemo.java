package com.sushma.Concurrency;

public class ThreadCreationDemo {

	public static void main(String[] args) {
  System.out.println("Main method : "+Thread.currentThread().getName());
  ProcessInfo pinfo=new ProcessInfo();
  pinfo.start();
  
  ExtractsData edata=new ExtractsData();
 
   new Thread(edata).start();;
	}

}

class ExtractsData implements Runnable
{

	@Override
	public void run() {
   System.out.println("Extracting Data");
   System.out.println("Data Extraction : "+Thread.currentThread().getName());
	}
	
	
}
class ProcessInfo extends Thread{
	@Override
	public void run() {
		System.out.println("Processing Information ......");
		System.out.println("In process : "+Thread.currentThread().getName());
	}
}
