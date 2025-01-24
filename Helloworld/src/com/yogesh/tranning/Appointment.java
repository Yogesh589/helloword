package com.yogesh.tranning;

public class Appointment {
	Patient patient;
	Doctor doctor;
	String date;

	
	Appointment(Patient patient, Doctor doctor, String date) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
	}
	

	public void bookAppoinment() {
		System.out.println("!!!!!!!!!!!!Hospital Maanagement System!!!!!!!!!!!");
		System.out.println("Date: "  + this.date);
		System.out.println("Health Issue : " + patient.healthissue);
		System.out.println("Patient Name : "+ patient.name);
		System.out.println("Assign Doctor Name : "+ doctor.name);		
	}
}
