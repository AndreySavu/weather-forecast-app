package com.example.weather_forecast_app.service;

import com.example.weather_forecast_app.client.WeatherClient;
import com.example.weather_forecast_app.model.WarningType;
import com.example.weather_forecast_app.model.WeatherForecast;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    private final WeatherClient weatherClient;

    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public WeatherForecast getForecast(int days) {
        List<Double> temperatures = weatherClient.getTemperatures(days);
        List<WarningType> warnings = new ArrayList<>();

        double averageTemperature = temperatures.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        if (averageTemperature < 5) {
            warnings.add(WarningType.FROST);
        }

        if (temperatures.stream().anyMatch(temp -> temp < -30)) {
            warnings.add(WarningType.COLD);
        }

        if (temperatures.stream().anyMatch(temp -> temp > 35)) {
            warnings.add(WarningType.HEAT);
        }

        return new WeatherForecast(temperatures, warnings);
    }
}
