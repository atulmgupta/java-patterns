package com.atul.java.patterns._1_creational._2_abstractFactory._2;

abstract class GasVehicle implements Vehicle {
	private CarBodyType type;

	GasVehicle(CarBodyType type) {
		this.type = type;
	}

	@Override
	public void drive() {
		System.out.println("Driving a gas " + type);
	}

	@Override
	public void fillUp() {
		System.out.println("your gas " + type + " is fueling...");
	}

	@Override
	public String toString() {
		return "\nEnergyType=Gas BodyType=" + type;
	}
}
