package com.qa.arrays;

import java.util.ArrayList;

public class ArrayListExercise {

	
	public static void main(String[] args) {
		
	}
	
//	You're working as a software dev for a well known coffee QABucks
//	You've got a list of orders and you need to have the following methods implemented to manage the orders:
//
//	2x array lists
//	- OrdersArray
//	- DoneOrdersArray
//
//	All methods you should be able to pass in data
//	- Add a new order to the orders array
//	- Return the name of the order
//	- Modify the order (passing in a string)
//	- Remove the order from the orders array
//	- Add the order to the doneOrders array
//	- Prints out the length of the orders and doneOrders array
//	- clears either or both of the arrays
//	
//	Orders to use:
//	Small Espresso w/ Chocolate
//	Large Cold Brew w/ double shot
//	Medium Cappucino w/ Oat Milk
//	Medium Flat White
//	Large Choc Cookie Frappe w/ sugar free syrup
//	Small Caramel Iced Latte w/ honeycomb dust
//	Small Americano
//	Large Cafe Au Lait w/ extra milk
//	Medium Strawberry Iced Tea
	
	public static void coffeeQABucks () {
		
		
		ArrayList<String> OrdersArray = new ArrayList<>();
		ArrayList<String> doneOrdersArray = new ArrayList<>();
		
		OrdersArray.add("Small Espresso w/ Chocolate");
		OrdersArray.add("Large Cold Brew w/ double shot");
		OrdersArray.add("Medium Cappucino w/ Oat Milk");
		OrdersArray.add("Medium Strawberry Iced Tea");
		System.out.println(OrdersArray);
		
		
		System.out.println(OrdersArray.get(2));
		
		
		OrdersArray.set(3, "Medium Peach Iced Tea");
		System.out.println(OrdersArray.get(3));
		
		
		OrdersArray.remove(0);
		System.out.println(OrdersArray);
		
		
		doneOrdersArray.add("Small Espresso w/ Chocolate");
		
		
		System.out.println("The order list: " + OrdersArray.size());
		System.out.println("The done order list: " + doneOrdersArray.size());
		
		
		doneOrdersArray.clear();
		System.out.println("After clearing the done list: " + doneOrdersArray);
		
		
		 
		
		
		
//Stretch goal - Using Multi Dimensional (Or objects if you're comfortable) split the orders into 
//		Size, drink and extras
//
//{{"small", "espresso", "chocolate"}, {}, {}}
		
	String [][] orderGridArray = {{"small", "espresso", "chocolate"}, {"large", "cold brew", "double shot"}, {"medium", "cappucino", "oat milk"}};
	
	System.out.println(orderGridArray[0][1]);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
