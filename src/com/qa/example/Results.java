package com.qa.example;

public class Results {

	public static void main(String[] args) {
	
		int physics = 145;
		int chemistry = 80;
		int biology = 125;
		int total = physics + chemistry + biology;
		int percentage = (total*100) / 450;
		
	
	displayResults(physics, chemistry, biology, total);
	displayPercentage(percentage);
}



	private static void displayResults(int physics, int chemistry, int biology, int total) {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		System.out.println("Total score: " + total);
		
	}
	
	private static void displayPercentage(int percentage) {
		
	System.out.println("Total Percentage: " + percentage);
	}	
}