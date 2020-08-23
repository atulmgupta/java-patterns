package com.atul.java.patterns.creational.abstractFactory._2;

public class VehicleFactory {
	private VehicleFactory() {
	}

	public static Vehicle CreateInstance(CarBodyType type, EnergyType energyType) {
		switch (energyType) {
		case Gas:
			return GasVehicleFactory.GetInstance(type);
		case Hybrid:
			return HybridVehicleFactory.GetInstance(type);
		case Electric:
			return ElectricVehicleFactory.GetInstance(type);
		default:
			throw new UnsupportedOperationException("EnergyType " + energyType + " not supported.");
		}
	}
}
