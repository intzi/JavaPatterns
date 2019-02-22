package com.intzi.observer.example2;

public interface Subject {

    void addSubscriber(Observer o);
    void removeSubscriber(Observer o);
    void notifySubscribers();
}
