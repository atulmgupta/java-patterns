package com.atul.java.patterns._3_behavioral._6_observer;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor(String... events) {
        this.events = new EventManager(events);
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
