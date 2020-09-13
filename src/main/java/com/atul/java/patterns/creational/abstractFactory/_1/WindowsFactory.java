package com.atul.java.patterns.creational.abstractFactory._1;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		 return new WindowsCheckbox();
	}

}
