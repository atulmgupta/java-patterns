package com.atul.java.patterns._1_creational.abstractFactory._2;

public class GasSedan extends GasVehicle {

	GasSedan(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your gas " + CarBodyType.SUV);

	}

}
