package com.IronHack.Lab2.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    public int getCurrentTemperature(){
        return random.nextInt(51)-10;
    }

    public String getWeatherCondition(){
        String[] conditions = {"sunny", "rainy", "snowy", "sleet"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed(){
        return random.nextInt(101);
    }
}
