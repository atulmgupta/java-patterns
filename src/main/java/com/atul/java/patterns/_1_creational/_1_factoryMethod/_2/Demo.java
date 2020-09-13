package com.atul.java.patterns._1_creational._1_factoryMethod._2;
/**
 * 
 * @author atulgupta
 * 
 * Factory Pattern
 * 2nd most used design pattern
 * 
 * Guarantee unique instance
 * Often refactored in
 * can help with performance issues
 * 
 * 
 * Concept
 * 
 * Doesnt expose instantation logic
 * 
 *
 */
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
