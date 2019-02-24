package com.intzi.decorator;

public abstract class Coffee {

    private String description = "Unknown";

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
