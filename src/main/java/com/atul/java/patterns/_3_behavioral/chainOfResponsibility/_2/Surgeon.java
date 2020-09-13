package com.atul.java.patterns._3_behavioral.chainOfResponsibility._2;

public abstract class Surgeon {
	protected Surgeon nextSurgeon;

	public void setNext(Surgeon next) {
		this.nextSurgeon = next;
	}

	public abstract void operate(SurgicalRequest request);

}
