package com.java.observers;

/**
 * @author Dhiraj
 * @date 24/06/18
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.78f);
    }
}
