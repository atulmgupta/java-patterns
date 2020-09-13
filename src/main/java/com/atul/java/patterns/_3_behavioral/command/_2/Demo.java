package com.atul.java.patterns._3_behavioral.command._2;

public class Demo {
	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();
		Command onCommand = new OnCommand(light);
		lightSwitch.storeAndExecute(onCommand);
	}
}
