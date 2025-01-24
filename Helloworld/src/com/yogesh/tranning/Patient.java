package com.yogesh.tranning;

public class Patient extends Person {
	String healthissue;
	
	Patient(int id, String name, int age, String healthissue ) {
		super(id, name, age);
	   this.healthissue = healthissue;	
	}

}
