package com.atul.java.patterns._3_behavioral._7_state._2;



public class USBState implements InputState{
    private final static USBState instance = new USBState();
    //to prevent instantiation outside
    private USBState(){}
    public static USBState getInstance(){
        return instance;
    }
    @Override
    public void changeInput(InputContext context) {
        System.out.println("Switching input to Bluetooth");
        context.setState(BluetoothState.getInstance());
    }
}
