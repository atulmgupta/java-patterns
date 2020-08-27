package com.atul.java.patterns.behavioral.strategy._2;

public interface AuthenticationProvider {
	 void login(String username, String password);
	    void logout();
}
