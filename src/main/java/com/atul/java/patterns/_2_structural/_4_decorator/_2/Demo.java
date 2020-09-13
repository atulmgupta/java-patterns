package com.atul.java.patterns._2_structural._4_decorator._2;

public class Demo {
    public static void main(String[] args) {
        FlightSeat mainCabinSeat = new WiFi(new HeadPhone(new LiveTV(new MainCabinSeat())));

        System.out.println("Chosen Facilities for your seat:");
        System.out.println(mainCabinSeat.getFacilities());
        System.out.println("Total Cost:" + mainCabinSeat.getCost());
    }
}
