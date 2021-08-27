package com.qa.example;

public class Flowcharts {

	public static void main(String[] args) {
		int Input = 120;
		
		if(Input >2000) {
			System.out.println("A");
			if (Input >6000) {
				System.out.println("C");
		} else {
			System.out.println("B");
			if (Input >4000) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}

	}
		else {
			System.out.println("1");
			if (Input >100) {
				System.out.println("3");
				if (Input >600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if (Input >500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			}else {
				System.out.println("2");
			}
		}
}
}