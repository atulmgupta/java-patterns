package com.atul.java.patterns.behavioral.state._2;



public class OpticalState implements InputState {
	private final static OpticalState instance = new OpticalState();

	// to prevent instantiation outside
	private OpticalState() {
	}

	public static OpticalState getInstance() {
		return instance;
	}

	@Override
	public void changeInput(InputContext context) {
		System.out.println("Switching input to Coaxial");
		context.setState(CoaxialState.getInstance());
	}
}
