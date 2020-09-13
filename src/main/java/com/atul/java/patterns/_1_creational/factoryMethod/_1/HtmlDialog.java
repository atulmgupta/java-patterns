package com.atul.java.patterns._1_creational.factoryMethod._1;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
