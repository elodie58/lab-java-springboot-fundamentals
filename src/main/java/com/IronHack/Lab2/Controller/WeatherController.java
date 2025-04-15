package com.IronHack.Lab2.Controller;

import com.IronHack.Lab2.Service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/weather")

public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("temperature")
    public String getTemperature() {
        return "Temperature:" + weatherService.getCurrentTemperature() + "°c";

    }

    @GetMapping("/condition")
    public String getWeatherCondition() {
        return "Condition: " + weatherService.getWeatherCondition();

    }

    @GetMapping("/wind")
    public String getWindSpeed() {
        return "Wind Speed: " + weatherService.getWindSpeed();
    }

    @GetMapping("/all")
    public Map<String, Object> getAllWeatherInformation() {
        return Map.of(
        "Temperature", weatherService.getCurrentTemperature(),

        "Condition", weatherService.getWeatherCondition(),
        "windSpeed", weatherService.getWindSpeed()
        ) ;
    }
}
