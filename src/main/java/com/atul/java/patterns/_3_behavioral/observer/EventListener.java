package com.atul.java.patterns._3_behavioral.observer;

import java.io.File;

public interface EventListener {
	 void update(String eventType, File file);
}
