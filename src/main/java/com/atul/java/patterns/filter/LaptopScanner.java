package com.atul.java.patterns.filter;

import java.util.List;

public class LaptopScanner {
    public static void main(String[] args) {
        List<Laptop> laptops = LaptopFactory.manufactureInBulk();
        AndCriteria searchCriteria = new AndCriteria(new Ram4GB(), new Macintosh(), new I7Processor());
        List<Laptop> filteredLaptops = searchCriteria.meets(laptops);
        filteredLaptops.forEach(laptop -> {
            System.out.println(laptop.getOperatingSystem() + "," + laptop.getRam() + "," + laptop.getProcessor());
        });
    }
}
