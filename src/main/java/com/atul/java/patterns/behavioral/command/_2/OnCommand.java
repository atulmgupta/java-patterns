package com.atul.java.patterns.behavioral.command._2;

public class OnCommand implements Command {
	private Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
