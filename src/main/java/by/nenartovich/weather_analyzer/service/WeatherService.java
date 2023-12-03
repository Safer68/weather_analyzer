package by.nenartovich.weather_analyzer.service;

import by.nenartovich.weather_analyzer.domain.error.NoValidDateException;
import by.nenartovich.weather_analyzer.domain.api.StorageAdapter;
import by.nenartovich.weather_analyzer.domain.model.PeriodWeather;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherService {
    private final StorageAdapter storageAdapter;

    public Weather getCurrent() {
        Weather weather = storageAdapter.getCurrent();
        log.info("Get current weather: {} ", weather);
        return weather;
    }

    public PeriodWeather getPeriodWeather(Instant from, Instant to) {
        if (from.isAfter(to)){
            throw new NoValidDateException("invalid date range");
        }
        List<Weather> weatherList = storageAdapter.getAllByDataBetween(from, to);
        PeriodWeather periodWeather = new PeriodWeather();
        periodWeather.setAverageTemp(weatherList.stream().mapToDouble(e -> e.getTemperature()).average().getAsDouble());
        periodWeather.setMinWindSpeed(weatherList.stream()
                .min(Comparator.comparingDouble(value -> value.getWindSpeed())).get().getWindSpeed());
        periodWeather.setMaxWindSpeed(weatherList.stream()
                .max(Comparator.comparingDouble(value -> value.getWindSpeed())).get().getWindSpeed());
        periodWeather.setMinPressure(weatherList.stream()
                .min(Comparator.comparingDouble(value -> value.getPressure())).get().getPressure());
        periodWeather.setMaxPressure(weatherList.stream()
                .max(Comparator.comparingDouble(value -> value.getPressure())).get().getPressure());
        periodWeather.setMinHumidity(weatherList.stream()
                .min(Comparator.comparingDouble(value -> value.getHumidity())).get().getHumidity());
        periodWeather.setMaxHumidity(weatherList.stream()
                .max(Comparator.comparingDouble(value -> value.getHumidity())).get().getHumidity());
        log.info("Request weather forecast for this period: from {} to {} ", from,to);
        return periodWeather;
    }
}
