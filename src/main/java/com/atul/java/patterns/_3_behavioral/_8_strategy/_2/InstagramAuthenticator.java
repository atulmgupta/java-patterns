package com.atul.java.patterns._3_behavioral._8_strategy._2;

public class InstagramAuthenticator implements AuthenticationProvider {
	@Override
	public void login(String username, String password) {
		System.out.println("Authenticating with instagram...");
	}

	@Override
	public void logout() {
		System.out.println("Logging out with instagram...");
	}
}
