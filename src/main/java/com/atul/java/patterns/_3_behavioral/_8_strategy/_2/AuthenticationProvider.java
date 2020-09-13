package com.atul.java.patterns._3_behavioral._8_strategy._2;

public interface AuthenticationProvider {
	 void login(String username, String password);
	    void logout();
}
