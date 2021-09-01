package com.qa.example;

public class ForLoop {

	// Exercise - Using a For Loop that starts with 8 and subtracts 1 each time
	// Logs out "1 pizza slice eaten, there are x slices left"
	// When there are only 2 slices left, loop carries on but prints out "time to get another pizza"
	
	
	public static void main(String[] args) {
		
	}
	
	public static void pizzaLoop () {
		
		for (int i = 8; i >= 0; i--) {
			System.out.println("1 pizza slice eaten, there are " + i-- + "slices left");
			if (i == 2);
			System.out.println("Time to get another pizza");
		}
	}
	
//	Create a 2nd for loop for pizzas, the parent pizza loop contains the child pizza slices loop. When all of the pizza slices go from one pizza, the pizza loop descends by one and the pizza slices loop resets
//
//	There are 4 pizzas and when there is only 1 pizza left say "Only one pizza left"
	
	
	
}
