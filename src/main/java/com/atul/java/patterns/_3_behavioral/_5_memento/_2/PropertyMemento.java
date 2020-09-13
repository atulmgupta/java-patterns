package com.atul.java.patterns._3_behavioral._5_memento._2;

import java.util.UUID;

public class PropertyMemento {
	private final UUID id;
    private final String address;
    private final double price;
    private final String phone;
    private final String date;
    public PropertyMemento(UUID id,
                           String address,
                           double price,
                           String phone,
                           String date){
        this.id = id;
        this.address = address;
        this.price = price;
        this.phone = phone;
        this.date = date;
    }
    public UUID getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public double getPrice() {
        return price;
    }
    public String getPhone() {
        return phone;
    }
    public String getDate() {
        return date;
    }
    @Override
    public String toString() {
        return "PropertyMemento {\n" +
                "\tid => " + id + "\n" +
                "\taddress => " + address +"\n" +
                "\tprice => " + price + "\n" +
                "\tphone => " + phone + "\n" +
                "\tdate => " + date + "\n" +
                '}';
    }
}
