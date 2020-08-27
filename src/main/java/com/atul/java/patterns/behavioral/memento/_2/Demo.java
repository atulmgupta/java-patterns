package com.atul.java.patterns.behavioral.memento._2;

import java.util.List;

/**
 * 
 * Implementing this pattern requires three objects:
	1. originator
	2. memento
	3. caretaker
	
	The originator is the object we’ll be making changes to. 
	It provides a way to create and restore mementos.
	
	The memento is a snapshot of the originator at some point in time. 
	Mementos can only be created and read by the originator and cannot be changed once created — i.e. mementos are immutable.
	
	The caretaker is the object that performs “create” and “restore” 
	memento operations on the originator object. Think of the caretaker as an administrator 
	that is capable of 
	taking snapshots (mementos) of a system (originator) and restores those snapshots at will.
 *
 */
public class Demo {
	public static void main(String[] args) {
		  //originator
	    Property property = new Property(
	            "1234 Imaginary Street, San Francisco, CA 94105",
	            2500000d,
	            "999-876-5432");
	  //Caretaker
	    Agent agent = new Agent(property);
	    agent.setPrice(2700000d);
	    agent.createMemento();
	    agent.setPhone("999-234-5678");
	    agent.createMemento();
	    agent.setAddress("1234 Real Street, San Francisco, CA 94105");
	    agent.createMemento();
	    agent.setPrice(2300000d);
	    agent.createMemento();
	    
	    List<PropertyMemento> mementos = agent.getMementos();
	    System.out.println("\n----Current State----");
	    System.out.println(property);
	    //restoring to mementos
	    agent.restoreMemento(mementos.get(0));
	    System.out.println(property);
	    agent.restoreMemento(mementos.get(2));
	    System.out.println(property);
	    agent.restoreMemento(mementos.get(1));
	    System.out.println(property);
	    
	}
}
