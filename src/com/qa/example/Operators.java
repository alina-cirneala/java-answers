package com.qa.example;

public class Operators {

	public static void main(String[] args) {
		
		//Calculator exercise
		
		addNumbers (5, 10);

	}

	private static void addNumbers(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
		substractNumbers (50, 13);
	}

	private static void substractNumbers(int num3, int num4) {
		
		System.out.println(num3 - num4);
	
    multiplyNumbers (89, 4);
}

	private static void multiplyNumbers(int num5, int num6) {
	System.out.println(num5*num6);
	
	divideNumbers (60, 7);
		
	}

	private static void divideNumbers(int num7, int num8) {
		
			System.out.println(num7/num8);
		
		
	}

	
}
