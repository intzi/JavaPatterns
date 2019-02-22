package com.intzi.observer.example1;

public class SecondSubscriber implements Observer{

    private String latestNewspaper;

    public SecondSubscriber(Subject subject){
        latestNewspaper = "";
        subject.addObserver(this);
    }

    @Override
    public void update(String newspaper) {
        latestNewspaper = newspaper;
        print();
    }

    public void print(){
        System.out.println("Newspaper Sub 2: "+latestNewspaper);
    }
}
