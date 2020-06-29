package com.atul.java.patterns.filter;

import java.util.List;

public interface Criteria {
	public List<Employee> meetCriteria(List<Employee> persons);
}
