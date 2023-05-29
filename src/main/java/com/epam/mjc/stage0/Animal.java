package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String hasFurVal = (this.hasFur) ? "a" : "no";
        String  numPawsVal = (this.numberOfPaws>1) ? "paws" : "paw";
        return "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" "+numPawsVal+" and "+ hasFurVal +" fur.";
    }
    @Override
    public String toString(){
        return getDescription();
    }
}
