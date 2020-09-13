package com.atul.java.patterns._1_creational.abstractFactory._2;

public class HybridSedan extends HybridVehicle {

	public HybridSedan(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		System.out.println("Greeting from your hybrid " + CarBodyType.Sedan);
	}
}
