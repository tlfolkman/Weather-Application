package com.example.weatherapp;

import android.widget.EditText;

import com.google.gson.Gson;

public class forecastThread implements Runnable {

    EditText city;

    forecastThread(EditText city)
    {
        this.city = city;
    }

    public void run()
    {
        readHttp http = new readHttp();
        String result = http.readHTTP("https://api.openweathermap.org/data/2.5/forecast?q=" + city.getText().toString() + "&mode=json&units=imperial&APPID=dfca96365cbeaf0e4b3dc6dd1483a70b");
        Gson gson = new Gson();
        WeatherConditions wc = gson.fromJson(result, WeatherConditions.class);
        System.out.println(wc);
    }
}
