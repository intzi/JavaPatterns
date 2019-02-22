package com.intzi.observer.example1;

public class FirstSubscriber implements Observer {

    private String latestNewspaper;

    public FirstSubscriber(Subject subject){
        latestNewspaper = "";
        subject.addObserver(this);
    }


    @Override
    public void update(String newspaper) {
        latestNewspaper = newspaper;
        print();
    }

    public void print(){
        System.out.println("Newspaper Sub 1: "+latestNewspaper);
    }
}
