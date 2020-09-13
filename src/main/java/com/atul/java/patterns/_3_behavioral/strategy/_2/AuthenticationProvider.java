package com.atul.java.patterns._3_behavioral.strategy._2;

public interface AuthenticationProvider {
	 void login(String username, String password);
	    void logout();
}
