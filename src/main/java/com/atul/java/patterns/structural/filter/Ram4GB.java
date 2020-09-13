package com.atul.java.patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class Ram4GB implements Criteria {
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        List<Laptop> filteredLaptops = laptops.stream().filter(laptop -> laptop.getRam().equals("4GB")).collect(Collectors.toList());
        return  filteredLaptops;
    }


}
