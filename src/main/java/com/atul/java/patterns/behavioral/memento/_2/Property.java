package com.atul.java.patterns.behavioral.memento._2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Property {
	private UUID id;
	private String address;
	private double price;
	private String phone;
	private String date;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

	public Property(String address, double price, String phone) {
		this.id = UUID.randomUUID();
		this.address = address;
		this.price = price;
		this.phone = phone;
		this.date = formatter.format(LocalDateTime.now());
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PropertyMemento create() {
		/**
		 * set date to current datatime
		 * whenever a memento gets created
		 */
		return new PropertyMemento(this.id, this.address, this.price, this.phone,
				formatter.format(LocalDateTime.now()));
	}

	public void restore(PropertyMemento memento) {
		this.id = memento.getId();
		this.address = memento.getAddress();
		this.price = memento.getPrice();
		this.phone = memento.getPhone();
		this.date = memento.getDate();
	}

	@Override
	public String toString() {
		return "Property {\n" + "\tid => " + id + "\n" + "\taddress => " + address + "\n" + "\tprice => " + price + "\n"
				+ "\tphone => " + phone + "\n" + "\tdate => " + date + "\n" + '}' + "\n";
	}

}
