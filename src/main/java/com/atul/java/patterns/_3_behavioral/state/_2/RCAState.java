package com.atul.java.patterns._3_behavioral.state._2;



public class RCAState implements InputState{
    private final static RCAState instance = new RCAState();
    //to prevent instantiation outside
    private RCAState(){}
    public static RCAState getInstance(){
        return instance;
    }
    @Override
    public void changeInput(InputContext context) {
        System.out.println("Switching input to USB");
        context.setState(USBState.getInstance());
    }
}
