package com.example.weather_forecast_app.controller;

import com.example.weather_forecast_app.model.WeatherForecast;
import com.example.weather_forecast_app.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/forecast")
    public WeatherForecast getWeatherForecast(@RequestParam int days) {
        return weatherService.getForecast(days);
    }
}
