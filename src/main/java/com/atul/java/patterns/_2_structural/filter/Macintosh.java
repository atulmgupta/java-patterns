package com.atul.java.patterns._2_structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class Macintosh implements Criteria {
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getOperatingSystem().equals("MAC")).collect(Collectors.toList());
    }
}
