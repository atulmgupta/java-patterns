package com.atul.java.patterns._3_behavioral._3_iterator;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
