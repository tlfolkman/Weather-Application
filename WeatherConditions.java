package com.example.weatherapp;;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class WeatherConditions {
    int id;
    String name;
    @SerializedName("main")
    HashMap<String, Float> messurements;


    @Override
    public String toString() {
        return "WeatherConditions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", measurements=" + messurements +
                '}';
    }
}

