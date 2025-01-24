package com.yogesh.tranning;

public class Doctor extends Person {
	String specialization;

	Doctor(int id, String name, int age,String specialization) {
		super(id, name, age);
		this.specialization = specialization;
	}
}
