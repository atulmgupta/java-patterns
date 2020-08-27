package com.atul.java.patterns.behavioral.state._2;

public class BluetoothState implements InputState {
	private final static BluetoothState instance = new BluetoothState();

	// to prevent instantiation outside
	private BluetoothState() {
	}

	public static BluetoothState getInstance() {
		return instance;
	}

	@Override
	public void changeInput(InputContext context) {
		System.out.println("Switching input to Optical");
		context.setState(OpticalState.getInstance());

	}

}
