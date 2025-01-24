package com.yogesh.tranning;

class Main {
	// Hospital Management System
	public static void main(String[] args) {
		Patient patient = new Patient(101, "RAM", 29, "fever");
		Doctor doctor = new Doctor(201, "Dr. Rahul Patil", 59, "MBBS");
		Appointment app = new Appointment(patient, doctor, "22-01-2024");
		app.bookAppoinment();
	}
}
