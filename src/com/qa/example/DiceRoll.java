package com.qa.example;

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		System.out.println(sixSided());
	}
	
	public static int diceManager () {
		int total = 0;
		total += sixSided();
		total += sixSided();
		total += sixSided();
		total += sixSided();
		return total;
		
	}
	
	
	public static int sixSided () {
		int roll = new Random().nextInt(6);
		roll += 1; 
		return roll;
	}
	
	
	
	// Rolling 3 separate 6 sided dice, adding the total to the total of 2 8sided dice:
	
	
//	public static void main(String[] args) {
//		
//	}
	
	
	
	
}
