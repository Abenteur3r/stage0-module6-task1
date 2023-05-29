package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog(){
        this("brown",4,true);
    }
    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
}
