package com.system.Misc;

public class ArrayDemo {
	static int[] marks;
	static int value;
public static void main(String[] args) {
	//int value=100;
	int marks1,marks2,marks3;
	marks=new int[5];
	marks[0]=45;
	marks[1]=43;
	marks[2]=23;
	marks[3]=95;
	
			
			//val=new int;
	System.out.println("value :"+value);
	System.out.println("Marks :"+marks);
	float[] appraisalsRatings= {3.75f, 4.7f ,4.9f, 3.8f};
	System.out.println(appraisalsRatings[2]);
	float[] appraisalsRating=new float[4];
	appraisalsRating[0]=3.75f;
	appraisalsRating[1]=4.7f;
	appraisalsRating[2]=4.9f;
	appraisalsRating[3]=3.8f;
	System.out.println(appraisalsRating[3]);
}
}
