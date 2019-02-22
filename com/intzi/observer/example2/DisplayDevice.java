package com.intzi.observer.example2;

public class DisplayDevice implements Observer{

    private Subject weatherStation;
    private float humidity;
    private float temperature;
    private float pressure;

    public DisplayDevice(Subject weatherStation){
        humidity = 0.0f;
        temperature = 0.0f;
        pressure = 0.0f;
        this.weatherStation = weatherStation;
        weatherStation.addSubscriber(this);
    }

    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    private void display(){
        System.out.println("\tDevice updated:" +
                "\t\tHumidity: "+humidity+
                "\t\tTemperature: "+temperature+
                "\t\tPressure: "+pressure);
    }
}
