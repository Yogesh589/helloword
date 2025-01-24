package com.yogesh.tranning.shopping;


public class Shoppingsystem {

	public static void main(String[] args) {
		//Product is abstract class we have created  reference of that class
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
