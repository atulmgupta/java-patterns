package com.atul.java.patterns.behavioral.strategy._2;

public class ContextAuthenticator {
	private AuthenticationProvider strategy;

	ContextAuthenticator(AuthenticationProvider strategy) {
		this.strategy = strategy;
	}

	public void login(String username, String password) {
		strategy.login(username, password);
	}

	public void logout() {
		strategy.logout();
	}
}
