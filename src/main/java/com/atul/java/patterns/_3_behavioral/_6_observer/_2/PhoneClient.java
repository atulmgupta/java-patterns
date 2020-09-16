package com.atul.java.patterns._3_behavioral._6_observer._2;

public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}

	@Override
	void update() {
		System.out.println("Phone Stream: "+subject.getState());

	}

}
