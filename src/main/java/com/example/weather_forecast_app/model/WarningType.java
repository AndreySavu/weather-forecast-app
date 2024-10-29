package com.example.weather_forecast_app.model;


public enum WarningType {
    FROST("заморозки"),
    COLD("аномальный холод"),
    HEAT("аномальная жара");

    private final String value;

    WarningType(String value) {
        this.value = value;
    }

    public String getDescription() {
        return value;
    }
}