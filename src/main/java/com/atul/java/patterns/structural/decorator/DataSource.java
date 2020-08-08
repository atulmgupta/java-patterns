package com.atul.java.patterns.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
