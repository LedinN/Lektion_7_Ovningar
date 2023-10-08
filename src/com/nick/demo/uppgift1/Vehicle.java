package com.nick.demo.uppgift1;

public interface Vehicle {

    void hasWheels();
    void Sound();


    default void Transport(String Sound){
        System.out.println(Sound);;
    }
}
