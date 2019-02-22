package com.intzi.observer.example2;

public class StatisticsDisplay implements Observer{

    private float humidity;
    private float temperature;
    private float pressure;

    public StatisticsDisplay(WeatherStation station){
        humidity = 0.0f;
        temperature = 0.0f;
        pressure = 0.0f;
        station.addSubscriber(this);
    }

    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = temperature;
        log();
    }

    private void log(){
        System.out.println(
            "\tSaved to Log: "+
            "\t\t Humidity: "+humidity+
            "\t\t Temperature: "+temperature+
            "\t\t Pressure: "+pressure);
    }
}
