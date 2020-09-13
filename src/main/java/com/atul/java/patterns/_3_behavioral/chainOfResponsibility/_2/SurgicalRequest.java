package com.atul.java.patterns._3_behavioral.chainOfResponsibility._2;

public class SurgicalRequest {
	private String firstname;
	private String lastname;
	private Specialties specialty;

	public SurgicalRequest(String firstname, String lastname, Specialties specialty) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialty = specialty;
	}

	public String getFirstname() {
		return firstname;
	}

	public Specialties getSpecialty() {
		return specialty;
	}

	public String getLastname() {
		return lastname;
	}
}
