package com.atul.java.patterns.creational.Prototype._2;

public class Demo {
	public static void main(String[] args)  {
	    try {
	        Staff staff = new Staff();
	        System.out.println("number of staff in: "
	                    + staff.getStaffNames().size());
	        Staff copiedStaff = (Staff)staff.clone();
	        System.out.println("number of staff: "
	                    + copiedStaff.getStaffNames().size());
	        System.out.println(staff.hashCode());
	            System.out.println(copiedStaff.hashCode());
	    } catch (CloneNotSupportedException e) {
	        e.printStackTrace();
	    }
	}
}
