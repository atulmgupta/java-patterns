package com.atul.java.patterns._3_behavioral._6_observer._2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();

	abstract void setState(String message);

	abstract String getState();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void deattach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObersvers() {
		for (Observer observer : observers)
			observer.update();
	}

}
