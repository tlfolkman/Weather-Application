package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city = findViewById(R.id.editText);
    }

    public void weather(View view)
    {
        weatherThread w = new weatherThread(city, this);
        Thread thread1 = new Thread(w, "Thread 1");
        thread1.start();
    }

    public void forecast(View view)
    {
        forecastThread f = new forecastThread(city);
        Thread thread2 = new Thread(f, "Thread 2");
        thread2.start();
    }
}
