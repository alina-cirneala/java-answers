package com.qa.example;

public class UniqueSum {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = 3;
		
		if (a == b && b == c) {
			System.out.println(0);
		} else if (a == b) {
			System.out.println(c);
	    } else if  (a == c) {
		System.out.println(b);
	    } else if (b == c) {
		System.out.println(a);
		} else {
			System.out.println(a+b+c);
		}

	}
	
}


