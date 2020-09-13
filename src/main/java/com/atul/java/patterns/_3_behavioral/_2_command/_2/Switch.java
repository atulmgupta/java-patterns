package com.atul.java.patterns._3_behavioral._2_command._2;

public class Switch {
	public void storeAndExecute(Command command) {
		command.execute();
	}
}
