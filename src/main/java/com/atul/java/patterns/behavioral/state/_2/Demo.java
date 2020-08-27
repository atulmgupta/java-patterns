package com.atul.java.patterns.behavioral.state._2;

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
