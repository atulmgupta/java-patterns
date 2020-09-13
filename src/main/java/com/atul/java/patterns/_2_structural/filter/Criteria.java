package com.atul.java.patterns._2_structural.filter;

import java.util.List;

public interface Criteria {
    List<Laptop> meets(List<Laptop> laptops);
}
