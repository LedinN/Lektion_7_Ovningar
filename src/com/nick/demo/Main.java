package com.nick.demo;

import com.nick.demo.uppgift1.Dog;
import com.nick.demo.uppgift1.Ford;
import com.nick.demo.uppgift1.Ship;

public class Main {
    public static void main(String[] args) {

        Ford Civic = new Ford();
        Ship Titanic = new Ship();
        Dog Fido = new Dog();


        Civic.hasWheels();
        Civic.Sound();
        Civic.Transport("Transporting Goods");

        Titanic.hasWheels();
        Titanic.Sound();
        Titanic.Transport("Transporting Containers");

        Fido.animalSound();
        Fido.sleep();



    }
}
