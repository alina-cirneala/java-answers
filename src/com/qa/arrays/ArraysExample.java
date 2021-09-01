package com.qa.arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
	}
	
	// Exercise -
	// Create 4 arrays for the following fields: names,
	// favColour, favNumber, likesPineappleOnPizza for 5 random people
	// System.out at least 1 different index from each array
	// Stretch goal - To alter / modify an existing value in an array
	
	public static void quickArrayExample () {
	
	String[] names = { "Anna", "Clara", "Tom", "Emma", "John"};
	String[] favColour = {"purple", "green", "yellow", "red", "blue"};
	int[] favNumber = {1, 76, 374, 23, 78};
	boolean[] likesPineappleOnPizza = {true, false, false, true, false};

	System.out.println(names[2]);
	System.out.println(favColour[4]);
	System.out.println(favNumber[3]);
	System.out.println(likesPineappleOnPizza[1]);
	
	
	// Exercise - Either doing it manually OR using a for loop,
	// modify the fav numbers you've got to their squared values
	
//	favNumber[4] = favNumber[4] * favNumber[4];
//	favNumber[3] = favNumber[3] * favNumber[3];
//	favNumber[2] = favNumber[2] * favNumber[2];
//	favNumber[1] = favNumber[1] * favNumber[1];
//	favNumber[0] = favNumber[0] * favNumber[0];
//	
//	for (int i=0; i< 5; i++) {
//		System.out.println(favNumber[i]);
//	
//	}
	
	// to see the amount of values in an array use .length
//	System.out.println(favNumber.length);
	
	for (int i=0; i < favNumber.length; i++) {
		int number = favNumber[i] * favNumber[i];
		System.out.println(number);
	}
	
	//Stretch goal - Create a new array containing the squared values

	
	 
	
//Second stretch goal - Create a new array containing the squared values 
//but in reverse order (64, 49, 36, 25..)
	
	
	
	
	
	
	
	
	}

 


}
