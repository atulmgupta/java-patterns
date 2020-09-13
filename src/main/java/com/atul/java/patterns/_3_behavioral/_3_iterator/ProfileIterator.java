package com.atul.java.patterns._3_behavioral._3_iterator;

public interface ProfileIterator {
	boolean hasNext();

	Profile getNext();

	void reset();
}
