package com.atul.java.patterns._2_structural._4_decorator._2;

public abstract class FlightSeatDecorator implements FlightSeat{
    protected FlightSeat flightSeat;

    public FlightSeatDecorator(FlightSeat flightSeat) {
        this.flightSeat = flightSeat;
    }

    public abstract String getFacilities();

    public abstract Double getCost();
}
