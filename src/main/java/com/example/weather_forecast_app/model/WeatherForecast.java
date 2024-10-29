package com.example.weather_forecast_app.model;

import java.util.List;

public class WeatherForecast {
    private List<Double> temperatures;
    private List<String> warnings;

    public WeatherForecast(List<Double> temperatures, List<String> warnings) {
        this.temperatures = temperatures;
        this.warnings = warnings;
    }

    public List<Double> getTemperatures() {
        return temperatures;
    }

    public List<String> getWarnings() {
        return warnings;
    }
}