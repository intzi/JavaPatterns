package com.intzi.decorator;

public class Espresso extends Coffee {

    public Espresso(){
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 2.40;
    }
}
