package com.atul.java.patterns._3_behavioral._7_state._2;

public class Demo {
	public static void main(String[] args) {
		InputContext context = new InputContext();
		context.changeState();
		context.changeState();
		context.changeState();
		context.changeState();
		context.changeState();
	}
}
