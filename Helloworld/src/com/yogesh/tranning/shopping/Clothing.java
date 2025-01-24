package com.yogesh.tranning.shopping;


public class Clothing extends Product {
	 
		public Clothing(String name, double price) {
	     super(name, price);
	 }

	 @Override
	 public void addToCart() {
	     System.out.println("Adding clothing item: " + getName() + " to the cart at " + getPrice());
	 }
}
