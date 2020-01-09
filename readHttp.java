package com.example.weatherapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class readHttp {
    public String readHTTP(String url)
    {
        try{
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder data = new StringBuilder();
            String line;
            do {
                line = reader.readLine();  // Read the next line
                if (line != null) {
                    data.append(line); // Append will concatenate the new string just read into the StringBuilder
                }
            }
            while (line != null);
            return data.toString();
        }
        catch (IOException ioe) {
            System.out.println("Error reading HTTP Response: "+ioe);
            return null;
        }
    }
}
