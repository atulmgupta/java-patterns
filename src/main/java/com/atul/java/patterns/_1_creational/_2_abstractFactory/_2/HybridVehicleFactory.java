package com.atul.java.patterns._1_creational._2_abstractFactory._2;

public class HybridVehicleFactory {
	private HybridVehicleFactory() {
	}

	static Vehicle GetInstance(CarBodyType type) {
		switch (type) {
		case SUV:
			return new HybridSUV(type);
		case Sedan:
			return new HybridSedan(type);
		default:
			throw new UnsupportedOperationException("enum " + type + "not supported.");
		}
	}
}
