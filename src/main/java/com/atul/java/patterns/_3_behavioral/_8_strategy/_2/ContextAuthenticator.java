package com.atul.java.patterns._3_behavioral._8_strategy._2;

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
