package com.java.designpatterns;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(observer);
    }

    private void measurementsChanged(){
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observers.forEach((observer -> observer.update(temp, pressure, humidity)));
    }

    public void setMeasurements(float temp,float pressure,float humidity){
        this.temp=temp;
        this.pressure=pressure;
        this.humidity=humidity;
        measurementsChanged();
    }
}
