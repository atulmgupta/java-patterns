package com.atul.java.patterns.creational.singleton._2;

public class Demo {
	public static void main(String[] args) {

		DBConnection eagerInstance = DBConnection.getInstance();
		eagerInstance.executeAction();

		LazyDBConnection lazyInstance = LazyDBConnection.getInstance();
		lazyInstance.executeAction();
	}
}
