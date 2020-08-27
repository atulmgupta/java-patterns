package com.atul.java.patterns.creational.singleton._2;

public class LazyDBConnection {
	private static volatile LazyDBConnection instance;

	// prevents the class from getting instantiated
	private LazyDBConnection() {
	}

	public static LazyDBConnection getInstance() {
		if (instance == null) {
			instance = new LazyDBConnection();
		}

		return instance;
	}

	public void executeAction() {
		System.out.println("CRUD action execute successfully");
	}
}
