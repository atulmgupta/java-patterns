package com.atul.java.patterns._1_creational._5_singleton._2;

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
