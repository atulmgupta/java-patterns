package com.atul.java.patterns.behavioral.memento._2;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private List<PropertyMemento> mementos = new ArrayList<>();
    private Property originator;
    public Agent(Property originator){
        this.originator = originator;
    }
    public void setPrice(double price){
        System.out.println(
                String.format("Setting price to %.2f",price));
        this.originator.setPrice(price);
    }
    public void setPhone(String phone){
        System.out.println(
                String.format("Setting phone to %s", phone));
        this.originator.setPhone(phone);
    }
    public void setAddress(String address){
        System.out.println(
                String.format("Setting address to %s", address));
        this.originator.setAddress(address);
    }
    public PropertyMemento createMemento(){
        System.out.println("Creating memento...");
        PropertyMemento memento = this.originator.create();
        this.mementos.add(memento);
        return memento;
    }
    public List<PropertyMemento> getMementos(){
        System.out.println("Retrieving mementos...");
        return  this.mementos;
    }
    public void restoreMemento(PropertyMemento memento){
        System.out.println("Restoring memento...");
        this.originator.restore(memento);
    }
}
