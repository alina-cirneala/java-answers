package com.qa.example;

public class BlackJack {

	public static void main(String[] args) {
		int A = 22;
		int B = 23;
		
		if (A>21) A = 0;
		if (B>21) B = 0;
		
		if (A>B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}

	}

}
