package com.yogesh.tranning.shopping;

public class Groceries extends Product {

	public Groceries(String name, double price) {
		super(name, price);
	}

	@Override
	public void addToCart() {
		System.out.println("Adding grocery item: " + getName() + " to the cart at " + getPrice());

	}
}
