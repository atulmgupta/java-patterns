package com.atul.java.patterns._1_creational.abstractFactory._2;

public class ElectricVehicleFactory {
	private ElectricVehicleFactory() {
	}

	static Vehicle GetInstance(CarBodyType type) {
		switch (type) {
		case SUV:
			return new ElectricSUV(type);
		case Sedan:
			return new ElectricSedan(type);
		default:
			throw new UnsupportedOperationException("enum " + type + "not supported.");
		}
	}
}
