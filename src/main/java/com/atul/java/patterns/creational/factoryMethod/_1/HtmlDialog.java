package com.atul.java.patterns.creational.factoryMethod._1;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
