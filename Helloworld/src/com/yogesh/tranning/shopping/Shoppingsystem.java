package com.yogesh.tranning.shopping;
/*Scenario 1: Online Shopping System
Imagine you are developing an online shopping system where customers can browse and purchase products. The system should manage different types of products, such as Electronics, Clothing, and Groceries. Each product has a name, price, and unique behavior when added to the cart.
Question:
How would you implement this system using OOP principles (abstraction, inheritance, polymorphism, and encapsulation)?
Write Java code to demonstrate the solution.*/

public class Shoppingsystem {

	public static void main(String[] args) {
		//Product is abstract class we have created  reference of that class
		System.out.println("!!!!!!!!!!!!!!!!!!!!!Shopping Application!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		 Product product = new Electronics("Mobile", 1200.00);
	     Product clothing = new Clothing("Jeans", 2500.00);
	     Product sugar = new Groceries("Sugar", 1200);
	     Cart cart = new Cart();
	     cart.addProduct(product);
	     cart.addProduct(clothing);
	     cart.addProduct(sugar);
	     System.out.println("Total price of items in cart: " + cart.getTotalPrice());
	}

}
