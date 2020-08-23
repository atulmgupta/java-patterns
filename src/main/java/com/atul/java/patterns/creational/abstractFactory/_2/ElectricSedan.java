package com.atul.java.patterns.creational.abstractFactory._2;

public class ElectricSedan extends ElectricVehicle{

	ElectricSedan(CarBodyType type) {
		super(type);
	}

	@Override
	public void greetDriver() {
		   System.out.println("Greeting from your electric " 
	                + CarBodyType.Sedan);
		
	}

}
