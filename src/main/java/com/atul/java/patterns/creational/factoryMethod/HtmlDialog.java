package com.atul.java.patterns.creational.factoryMethod;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
