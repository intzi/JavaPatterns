package com.intzi.observer.example2;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation extends Thread implements Subject{

    private Random r = new Random();
    private ArrayList<Observer> subscribers = new ArrayList<>();
    private float humidity;
    private float temperature;
    private float pressure;

    public WeatherStation(){

        System.out.println("Weather Station Started.");
        updateSensors(0.0f, 0.0f, 0.0f);
    }

    private void updateSensors(float humidity, float temperature, float pressure){

        //Update all the Sensors
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        System.out.println(this);
        notifySubscribers();
    }

    @Override
    public void run() {

        //Sleeping for Rand time and Updating the Sensors with Rand values.
        while (true){
            try {

                Thread.sleep(randomSleep());
                updateSensors(randomSensor(), randomSensor(), randomSensor());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int randomSleep(){

        //Random number between 5000-10000;
        return r.nextInt(10000)+5000;
    }

    private int randomSensor(){

        //Random number between 0-100;
        return r.nextInt(100);
    }

    @Override
    public String toString() {

        //Print all the Sensors;
        return  "Weather Station Sensors:"+
                "\tHumidity: "+humidity+
                "\tTemperature: "+temperature+
                "\tPressure: "+pressure;
    }

    @Override
    public void addSubscriber(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeSubscriber(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifySubscribers() {

        //Notify All Subscribers;
        for(Observer o : subscribers){
            o.update(humidity, temperature, pressure);
        }
    }
}
