package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        CurrentConditionDisplay currentConditionDisplay= new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,70,60);
        //weatherData.setMeasurements(89,23,76);
    }
}
