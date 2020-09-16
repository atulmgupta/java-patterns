package com.atul.java.patterns._3_behavioral._6_observer._2;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<>();

	@Override
	void setState(String message) {
		messageHistory.add(message);
		this.notifyObersvers();
	}

	@Override
	String getState() {

		return messageHistory.getLast();
	}

}
