package by.nenartovich.weather_analyzer.service;

import by.nenartovich.weather_analyzer.domain.api.ClientAdapter;
import by.nenartovich.weather_analyzer.domain.api.StorageAdapter;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchedulerService {
    private final StorageAdapter storageAdapter;
    private final ClientAdapter clientAdapter;

    public void writeWeather() {
        Weather weather = clientAdapter.getWeather();
        log.info("Receive a save request: {}", weather);
        if (weather != null) {
            weather.setData(Instant.now());
            storageAdapter.saveWeather(weather);
        }
    }
}
