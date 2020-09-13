package com.atul.java.patterns._2_structural._2_bridge;

public interface Device {
	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);

	void printStatus();
}
