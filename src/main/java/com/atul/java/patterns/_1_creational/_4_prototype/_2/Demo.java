package com.atul.java.patterns._1_creational._4_prototype._2;
/**
 * @author atulgupta
 * 
 * 
 * Prototype Pattern
 * Lighter and faster object
 * 
 * 
 * *******  Pitfalls  *******
 * used with another patterns
 * * Registry
 * Shallow VS Deep Copy
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in java");

		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
	}
}
