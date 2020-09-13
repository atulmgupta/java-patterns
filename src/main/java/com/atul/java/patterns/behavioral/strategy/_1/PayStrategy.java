package com.atul.java.patterns.behavioral.strategy._1;

public interface PayStrategy {
	boolean pay(int paymentAmount);

	void collectPaymentDetails();
}
