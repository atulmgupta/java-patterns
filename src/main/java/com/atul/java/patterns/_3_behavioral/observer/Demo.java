package com.atul.java.patterns._3_behavioral.observer;

public class Demo {
	public static void main(String[] args) {
        Editor editor = new Editor("open","save","delete","undo");
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.unsubscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
