package com.atul.java.patterns._3_behavioral.iterator;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
