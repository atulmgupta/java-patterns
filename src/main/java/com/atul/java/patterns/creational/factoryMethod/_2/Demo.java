package com.atul.java.patterns.creational.factoryMethod._2;

public class Demo {
	public static void main(String[] args) {
		Pastry baklava = PastryFactory.CreateInstance(PastryType.Baklava);
		Pastry cinnamonRoll = PastryFactory.CreateInstance(PastryType.CinnamonRoll);
		Pastry puff = PastryFactory.CreateInstance(PastryType.Puff);
		Pastry flaky = PastryFactory.CreateInstance(PastryType.Flaky);
		System.out.println(baklava.getFirstTimeImpression());
		System.out.println(cinnamonRoll.getFirstTimeImpression());
		System.out.println(puff.getFirstTimeImpression());
		System.out.println(flaky.getFirstTimeImpression());
	}
}
