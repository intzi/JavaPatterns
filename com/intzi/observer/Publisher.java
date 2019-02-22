package com.intzi.observer;

import java.util.ArrayList;

public class Publisher implements Subject{

    private ArrayList<Observer> observers;
    private String newspaper = "";

    public Publisher(){
        observers = new ArrayList<>();
    }


    public void addNewspaperAndNotify(String newspaper){
        this.newspaper = newspaper;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(newspaper);
        }
    }
}
