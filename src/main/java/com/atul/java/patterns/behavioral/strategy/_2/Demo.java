package com.atul.java.patterns.behavioral.strategy._2;

public class Demo {
	public static void main(String[] args) {
		// sign in with facebook
		ContextAuthenticator context = new ContextAuthenticator(new FacebookAuthenticator());
		context.login("james@gml.com", "S*s23Sd");
		context.logout();
		// sign in with google
		context = new ContextAuthenticator(new FacebookAuthenticator());
		context.login("jack@gml.com", "Jkjs23*kw");
		context.logout();
		// sign in with linkedIn
		context = new ContextAuthenticator(new LinkedInAuthenticator());
		context.login("dave@gml.com", "Ijks9&js@3");
		context.logout();
		// sign in with instagram
		context = new ContextAuthenticator(new InstagramAuthenticator());
		context.login("yoda@dcb.com", "HUs&2!3*kw");
		context.logout();
	}
}
