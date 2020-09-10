package com.atul.java.patterns.behavioral.command._2;

public class Switch {
	public void storeAndExecute(Command command) {
		command.execute();
	}
}
