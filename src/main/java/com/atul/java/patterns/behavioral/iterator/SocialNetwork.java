package com.atul.java.patterns.behavioral.iterator;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
