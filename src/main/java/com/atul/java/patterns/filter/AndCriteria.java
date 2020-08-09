package com.atul.java.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria[] criterias;
    public AndCriteria(Criteria... criterias){
        this.criterias = criterias;
    }

    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        List<Laptop> filteredLaptops = laptops;
        for(Criteria criteria:criterias){
            filteredLaptops = criteria.meets(filteredLaptops);
        }
        return  filteredLaptops;
    }
}
