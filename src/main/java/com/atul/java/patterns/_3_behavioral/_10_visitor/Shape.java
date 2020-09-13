package com.atul.java.patterns._3_behavioral._10_visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
