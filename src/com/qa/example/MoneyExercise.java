package com.qa.example;

public class MoneyExercise {

	public static void main(String[] args) {
		
	
	
//	public static void moneySpending() {
//		int money = 200;
//		boolean tooMuchSpending = false;
//		while (tooMuchSpending == false) {
//			if (money < 50) {
//				tooMuchSpending = true;
//			}
//			System.out.println("Amount of money: " + money);
//			money--;
//			System.out.println("Money has been taken, new amount: " + money);
//		}
//	}
	
	
	int money = 200;
	spending(money);
 }
	
	private static void spending(int x) {
		while (x > 50) {
			System.out.println(x);
			x -= 30;
		}
		if (x <= 50) {
			System.out.println("Stop spending money");
		}
	}
	
	

	
	
	
	
}
