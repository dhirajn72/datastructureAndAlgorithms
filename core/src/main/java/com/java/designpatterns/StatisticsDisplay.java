package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class StatisticsDisplay implements Observer,Display {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public StatisticsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: Current condition: "+temp +" F degrees and "+humidity+" % Humidity ");
    }
}
