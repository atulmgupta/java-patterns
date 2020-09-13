package com.atul.java.patterns._3_behavioral.iterator;

public interface ProfileIterator {
	boolean hasNext();

	Profile getNext();

	void reset();
}
