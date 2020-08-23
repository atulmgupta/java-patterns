package com.atul.java.patterns.creational.abstractFactory._2;

public class GasSUV extends GasVehicle {

	GasSUV(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your gas " + CarBodyType.SUV);

	}

}
