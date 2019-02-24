package com.intzi.decorator;

public class Black extends Coffee {


    public Black() {
        setDescription("Black");
    }

    @Override
    public double cost() {
        return 1.44;
    }
}
