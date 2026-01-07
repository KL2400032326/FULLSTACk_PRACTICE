package com.klu;

public class Car {
    private Engine engine;

    // setter injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.Start();
        System.out.println("Car is moving...");
    }
}
