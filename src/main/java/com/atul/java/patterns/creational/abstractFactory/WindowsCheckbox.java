package com.atul.java.patterns.creational.abstractFactory;

public class WindowsCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("You have created WindowsCheckbox.");		
	}

}
