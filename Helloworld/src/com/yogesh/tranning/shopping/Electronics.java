package com.yogesh.tranning.shopping;


public class Electronics extends Product {
	public Electronics(String name, double price) {
		super(name, price);
	}

	@Override
	public void addToCart() {
		System.out.println("Adding electronic product: " + getName() + " to the cart at " + getPrice());
	}
}