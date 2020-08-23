package com.atul.java.patterns.creational.abstractFactory._2;

public class HybridSUV extends HybridVehicle {

	public HybridSUV(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your hybrid " + CarBodyType.SUV);

	}

}
