package com.example.weatherapp;;

import java.util.HashMap;
import java.util.List;

public class WeatherForcast {
    List<WeatherDetail>weather;
    String dt_txt;
    HashMap<String, Float> main;
    WeatherWind wind;


    @Override
    public String toString() {
        return "WeatherForecast{" +
                "Time=" + dt_txt +
                ", Temperature='" + main + '\'' +
                ", Description=" + weather +
                ", Wind Speed=" + wind +
                '}';
    }
}


