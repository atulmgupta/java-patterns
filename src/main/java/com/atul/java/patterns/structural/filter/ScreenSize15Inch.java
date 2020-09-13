package com.atul.java.patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class ScreenSize15Inch implements  Criteria{
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getScreenSize().equals("ScreenSize15Inch")).collect(Collectors.toList());
    }
}
