package by.nenartovich.weather_analyzer.api.rest_api.model;

import java.io.Serializable;
import java.time.Instant;

public record ResponseWeatherDto(Instant data,
                                 Double temperature,
                                 Double windSpeed,
                                 Double pressure,
                                 Double humidity,
                                 String condition,
                                 String city) implements Serializable {
}