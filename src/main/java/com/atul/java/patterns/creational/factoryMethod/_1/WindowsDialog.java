package com.atul.java.patterns.creational.factoryMethod._1;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}