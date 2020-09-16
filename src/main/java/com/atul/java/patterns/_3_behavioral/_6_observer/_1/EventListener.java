package com.atul.java.patterns._3_behavioral._6_observer._1;

import java.io.File;

public interface EventListener {
	 void update(String eventType, File file);
}
