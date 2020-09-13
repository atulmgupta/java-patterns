package com.atul.java.patterns._3_behavioral.strategy._1;

public interface PayStrategy {
	boolean pay(int paymentAmount);

	void collectPaymentDetails();
}
