package com.sushma.ListsDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class TreeExtensionDemo {

	public static void main(String[] args) {
		TreeSet<Furniture> furnSet=new TreeSet<Furniture>();
		Deque<Integer> d=new ArrayDeque<>();
		furnSet.add(new Furniture("Chair","Plastic"));
		Furniture table=new Furniture("Table","Glass");
		furnSet.add(table);
		furnSet.add(new Furniture("Bed","Plywood"));
		furnSet.add(new Furniture("Box","wood"));
		furnSet.add(new Furniture("teapoy","acrylic"));
		System.out.println(furnSet);
		for (Furniture furniture : furnSet) {
			System.out.println(furniture.getMaterial());
		}
	}

}

class Furniture implements Comparable<Furniture>
{String name;
String material;

public Furniture(String name, String material) {
	super();
	this.name = name;
	this.material = material;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
@Override
public int compareTo(Furniture another) {
	   
	return material.compareTo(another.getMaterial());
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Furniture [material ="+material+"name:"+name;
	}
}
