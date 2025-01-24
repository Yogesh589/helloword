package com.yogesh.tranning.shopping;


public class Cart {
	 private double totalPrice = 0.0;

	 public void addProduct(Product product) {
	     product.addToCart();
	     totalPrice += product.getPrice();
	 }

	 public double getTotalPrice() {
	     return totalPrice;	 
}
}
