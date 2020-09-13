package com.atul.java.patterns.structural.decorator._2;

public class MainCabinSeat implements  FlightSeat{
    @Override
    public String getFacilities() {
        return "Main Cabin Seat";
    }

    @Override
    public Double getCost() {
        return 500.0;
    }
}
