package com.atul.java.patterns._1_creational._2_abstractFactory._1;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
