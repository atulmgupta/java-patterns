package com.atul.java.patterns._2_structural._4_decorator._2;

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
