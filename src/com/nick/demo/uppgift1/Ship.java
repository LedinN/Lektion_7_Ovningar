package com.nick.demo.uppgift1;

public class Ship implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("Has no wheels!");
    }

    @Override
    public void Sound() {
        System.out.println("splat");
    }
}
