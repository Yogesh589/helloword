package com.yogesh.tranning.shopping;

public abstract class Product {
	//Created abstract class to achieve abstraction
	 private String name;
	 private double price;

	 public Product(String name, double price) {
	     this.name = name;
	     this.price = price;
	 }

	 public String getName() {
	     return name;
	 }

	 public void setName(String name) {
	     this.name = name;
	 }

	 public double getPrice() {
	     return price;
	 }

	 public void setPrice(double price) {
	     this.price = price;
	 }
// Created abstract method here we know the this method is not completed logically 100 %
	 public abstract void addToCart();
	
}
