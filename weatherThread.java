package com.example.weatherapp;

import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

public class weatherThread implements Runnable {

    private EditText city;
    MainActivity mainActivity;


    weatherThread(EditText city, MainActivity mainActivity)
    {
        this.city = city;
        this.mainActivity = mainActivity;
    }

    public void run()
    {
        readHttp http = new readHttp();
        String result2 = http.readHTTP("https://api.openweathermap.org/data/2.5/weather?q=" + city.getText().toString() + "&units=imperial&APPID=dfca96365cbeaf0e4b3dc6dd1483a70b");
        Gson gson = new Gson();
        final WeatherConditions wc = gson.fromJson(result2, WeatherConditions.class);
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(mainActivity.getApplicationContext(), "Temperature "  + wc.messurements.get("temp"),Toast.LENGTH_LONG).show();
            }
        });
    }



}
