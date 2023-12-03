package by.nenartovich.weather_analyzer.domain.api;

import by.nenartovich.weather_analyzer.domain.model.Weather;

import java.time.Instant;
import java.util.List;

public interface StorageAdapter {
    void saveWeather(Weather weather);

    Weather getCurrent();

    List<Weather> getAllByDataBetween(Instant from, Instant to);
}
