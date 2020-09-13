package com.atul.java.patterns._1_creational._5_singleton._2;

public class LazyDBConnection_MultiThread {
	private static volatile LazyDBConnection_MultiThread instance;

	// prevents the class from getting instantiated
	private LazyDBConnection_MultiThread() {
	}

	public static LazyDBConnection_MultiThread getInstance() {

		if (instance == null) {
			synchronized (LazyDBConnection_MultiThread.class) {
				instance = new LazyDBConnection_MultiThread();
			}
		}

		return instance;
	}

	public void executeAction() {

		System.out.println("CRUD action execute successfully");
	}
}
