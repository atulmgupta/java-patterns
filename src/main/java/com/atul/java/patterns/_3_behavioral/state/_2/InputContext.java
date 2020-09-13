package com.atul.java.patterns._3_behavioral.state._2;

public class InputContext {
	private InputState state;
    public InputContext()
    {
        this.state = BluetoothState.getInstance();
    }
    
    public void setState(final InputState state) {
        this.state = state;
    }
    public void changeState() {
        this.state.changeInput(this);
    }
    public InputState getState() {
        return this.state;
    }
}
