package com.system.apie;

/**
 * @author SushmaTN
 *
 */
public class AbstractionDemo {

	public static void main(String[] args) {
    System.out.println("number of procesors "+Runtime.getRuntime().availableProcessors());
	Check c=new Check();
	c.getInfo();
	}}