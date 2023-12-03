package by.nenartovich.weather_analyzer.api.rest_api.model;

import java.io.Serializable;

public record ResponseWeatherSpecifiedPeriodDto(Double averageTemp,
                                                Double minWindSpeed,
                                                Double maxWindSpeed,
                                                Double minPressure,
                                                Double maxPressure,
                                                Double minHumidity,
                                                Double maxHumidity) implements Serializable {
}
