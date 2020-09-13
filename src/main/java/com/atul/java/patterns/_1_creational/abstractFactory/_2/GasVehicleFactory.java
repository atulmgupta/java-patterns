package com.atul.java.patterns._1_creational.abstractFactory._2;

public class GasVehicleFactory {
	private GasVehicleFactory() {
	}

	static Vehicle GetInstance(CarBodyType type) {
		switch (type) {
		case SUV:
			return new GasSUV(type);
		case Sedan:
			return new GasSedan(type);
		default:
			throw new UnsupportedOperationException("" + "enum " + type + "not supported.");
		}
	}
}
