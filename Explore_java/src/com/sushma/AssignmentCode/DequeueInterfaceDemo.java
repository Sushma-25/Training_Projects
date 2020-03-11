package com.sushma.AssignmentCode;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueInterfaceDemo {

	public static void main(String[] args) {
		 Deque<String> cities = new LinkedList<String>(); 
		  cities.add("bangalore"); // adds an element to tail 
	        cities.addFirst("Kolkata");//adds an element to head of queue 
	        cities.addLast("Mangalore"); //adds an element to tail
	        System.out.println(cities + "\n"); 
	        cities.push("Mumbai"); //adds an element to head 
	        cities.offer("Delhi"); //Adds an element to the tail and returns a boolean to explain if the insertion was successful.
	        cities.offerFirst("Chennai"); //Adds an element to the head and returns a boolean to explain if the insertion was successful.
	        cities.offerLast("Pune"); //Adds an element to he tail and returns a boolean to explain if the insertion was successful.
	            
	        System.out.println(cities + "\n"); 
	         System.out.println("........................");
	        // Iterate through the queue elements. 
		
		  System.out.print("Standard Iterator : {"); 
		  Iterator<String> iterator = cities.iterator();
		  while (iterator.hasNext()) System.out.print( iterator.next()+" ");
		  System.out.println(" }");
		  System.out.println("\n........................\n");
		  // Reverse order iterator 
		  Iterator reverse = cities.descendingIterator();
		  System.out.print("\nReverse Iterator : {");
		  while (reverse.hasNext())
		  System.out.print( reverse.next()+" ");
		  System.out.println("}");
		  System.out.println("\n........................\n");
		  // Peek returns the head, without deleting  it from the deque
		  System.out.println("Peek " + cities.peek());
		  System.out.println("After peek: " + cities);
		  System.out.println("\n........................\n");
		  // Pop returns the head, and removes it from the deque
		  System.out.println("Pop " + cities.pop()); 
		  System.out.println("After pop: " + cities);
		  System.out.println("\n........................\n");
		  // We can check if a specific element exists // in the deque
		  System.out.println("Contains element 3: " +
		  cities.contains("bangalore"));
		  System.out.println("\n........................\n");
		  // We can remove the first / last element. 
		  cities.removeFirst();
		  cities.removeLast(); 
		  System.out.println("Deque after removing first and last: " + cities);
		  }

}
