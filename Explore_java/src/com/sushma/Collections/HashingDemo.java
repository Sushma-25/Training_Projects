package com.sushma.Collections;

import java.util.HashMap;
//Demo of overriding hash code and equals methods.
public class HashingDemo {

	public static void main(String[] args) {

		Book hp=new Book(123,"HP Curse Child","JK Rolwing");
		Book ycw=new Book(455,"You Can Win","Shiv Kera");
		Book rdpd=new Book(789,"Rich Dad Poor Dad","Robert Kiyoski");
      HashMap< Book, Integer> booksmap=new HashMap<>();
      booksmap.put(hp, 123);
      booksmap.put(ycw, 455);
      booksmap.put(rdpd, 789);
      System.out.println(ycw);
      System.out.println(booksmap.get(ycw));
      
      
      Book ycwnew=new Book(455,"You Can Win","Shiv Kera");//same values
    System.out.println(ycwnew);   
      System.out.println(booksmap.get(ycwnew));
	}

}
class Book{
	int id;
	String name;
	String author;
	
	
	  @Override 
	  public int hashCode() {
	  
	  return id*235; }
	  
	 @Override 
	 public boolean equals(Object obj) { 
	 Book refbook=(Book)obj; 
	 return this.name.equals(refbook.getName()); }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
}