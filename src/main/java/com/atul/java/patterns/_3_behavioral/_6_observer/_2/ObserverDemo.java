package com.atul.java.patterns._3_behavioral._6_observer._2;

public class ObserverDemo {
	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Welcome");
	}
}
