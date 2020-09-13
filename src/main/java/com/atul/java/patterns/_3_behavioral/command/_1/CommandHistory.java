package com.atul.java.patterns._3_behavioral.command._1;

import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();

	public void push(Command c) {
		history.push(c);
	}

	public Command pop() {
		return history.pop();
	}

	public boolean isEmpty() {
		return history.isEmpty();
	}
}
