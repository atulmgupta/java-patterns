package com.atul.java.patterns._3_behavioral.state._2;



public class CoaxialState implements InputState{
    private final static CoaxialState instance = new CoaxialState();
    //to prevent instantiation outside
    private CoaxialState(){}
    public static CoaxialState getInstance(){
        return instance;
    }
    @Override
    public void changeInput(InputContext context) {
        System.out.println("Switching input to RCA");
        context.setState(RCAState.getInstance());
    }
}