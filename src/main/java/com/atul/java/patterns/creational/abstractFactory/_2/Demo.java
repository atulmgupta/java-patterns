package com.atul.java.patterns.creational.abstractFactory._2;

public class Demo {
	public static void main(String[] args) {
		Vehicle hybridSedan = VehicleFactory.CreateInstance(CarBodyType.Sedan, EnergyType.Hybrid);
		System.out.println(hybridSedan);
		hybridSedan.fillUp();
		hybridSedan.greetDriver();
		hybridSedan.drive();
		Vehicle gasSUV = VehicleFactory.CreateInstance(CarBodyType.SUV, EnergyType.Gas);
		System.out.println(gasSUV);
		gasSUV.fillUp();
		gasSUV.greetDriver();
		gasSUV.drive();
		Vehicle electricSedan = VehicleFactory.CreateInstance(CarBodyType.Sedan, EnergyType.Electric);
		System.out.println(electricSedan);
		electricSedan.fillUp();
		electricSedan.greetDriver();
		electricSedan.drive();
	}
}
