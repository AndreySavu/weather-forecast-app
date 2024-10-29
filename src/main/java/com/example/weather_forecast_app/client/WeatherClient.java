package com.example.weather_forecast_app.client;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class WeatherClient {
    public List<Double> getTemperatures(int days) {
        Random random = new Random();
        List<Double> temperatures = new ArrayList<>();

        for (int i = 0; i < days; i++) {
            temperatures.add(-10 + random.nextDouble() * 50); // Генерация температуры от -10 до 40 градусов
        }

        return temperatures;
    }
}
