package com.atul.java.patterns.structural.filter;

import java.util.List;

public interface Criteria {
    List<Laptop> meets(List<Laptop> laptops);
}
