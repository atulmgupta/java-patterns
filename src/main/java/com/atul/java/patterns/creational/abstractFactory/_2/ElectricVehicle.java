package com.atul.java.patterns.creational.abstractFactory._2;

abstract class ElectricVehicle implements Vehicle{
	private CarBodyType type;

	ElectricVehicle(CarBodyType type) {
		this.type = type;
	}

	@Override
	public void drive() {
		System.out.println("Driving an electric " + type);
	}

	@Override
	public void fillUp() {
		System.out.println("your electric " + type + " is Charging...");
	}

	@Override
	public String toString() {
		return "\nEnergyType=Electric BodyType=" + type;
	}
}
