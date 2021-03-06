package com.atul.java.patterns._1_creational._2_abstractFactory._2;

public class HybridSUV extends HybridVehicle {

	public HybridSUV(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your hybrid " + CarBodyType.SUV);

	}

}
