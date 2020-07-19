package com.atul.java.patterns.creational.builder.singleton;

public class AirforceOne {
	// The sole instance of the class
	private static AirforceOne onlyInstance;

	/**
	 * Multithreading
	 * There are two trivial ways to fix this race condition.
	 * 
	 * synchronized public static AirforceOne getInstance()
	 * 
	 * The sole instance of the class
	 * private static AirforceOne onlyInstance = new AirforceOne();
	 */

	
	
	// Make the constructor private so its only accessible to
	// members of the class.
	private AirforceOne() {
	}

	public void fly() {
		System.out.println("Airforce one is flying...");
	}

	// Create a static method for object creation
	public static AirforceOne getInstance() {

		// Only instantiate the object when needed.
		if (onlyInstance == null) {
			onlyInstance = new AirforceOne();
		}

		return onlyInstance;
	}
}
