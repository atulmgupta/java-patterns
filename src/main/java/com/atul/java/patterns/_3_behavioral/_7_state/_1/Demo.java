package com.atul.java.patterns._3_behavioral._7_state._1;

public class Demo {
	public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
