package com.atul.java.patterns.creational.abstractFactory._2;

public class ElectricSUV extends ElectricVehicle {

	ElectricSUV(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your electric " + CarBodyType.SUV);

	}

}
