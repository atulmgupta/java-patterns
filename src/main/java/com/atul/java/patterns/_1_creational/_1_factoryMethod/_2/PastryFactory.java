package com.atul.java.patterns._1_creational._1_factoryMethod._2;

public class PastryFactory {
	public static Pastry CreateInstance(PastryType type){
		switch (type) {
		case Puff:
			return new Puff();
		case Baklava:
			return new Baklava();
		case Flaky:
			return new Flaky();
		case CinnamonRoll:
			return new CinnamonRoll();
		default:
			break;
		}
		return null;
	}
}
