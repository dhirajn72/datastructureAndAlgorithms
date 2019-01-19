package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class ForecastDisplay implements Observer,Display {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public ForecastDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp=temp;
        this.pressure =pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: Current condition: "+temp +" F degrees and "+humidity+" % Humidity ");
    }
}
