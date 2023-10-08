package com.nick.demo.uppgift1;

public class Ford implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("Has 4 wheels.");
    }

    @Override
    public void Sound() {
        System.out.println("Brum brum!");
    }
}
