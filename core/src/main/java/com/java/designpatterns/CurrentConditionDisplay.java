package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class CurrentConditionDisplay implements Observer,Display {
    private float temp;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println( "CurrentConditionDisplay: Current condition: "+temp +" F degrees and "+humidity+" % Humidity ");
    }
}
