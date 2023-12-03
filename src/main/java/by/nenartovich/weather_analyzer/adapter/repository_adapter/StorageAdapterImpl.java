package by.nenartovich.weather_analyzer.adapter.repository_adapter;

import by.nenartovich.weather_analyzer.adapter.repository_adapter.repository.WeatherRepository;
import by.nenartovich.weather_analyzer.domain.api.StorageAdapter;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

import static by.nenartovich.weather_analyzer.adapter.repository_adapter.mapper.WeatherEntityMapper.WEATHER_ENTITY_MAPPER;

@Service
@RequiredArgsConstructor
public class StorageAdapterImpl implements StorageAdapter {
    private final WeatherRepository weatherRepository;

    @Override
    public void saveWeather(Weather weather) {
        weatherRepository.save(WEATHER_ENTITY_MAPPER.toEntity(weather));
    }

    @Override
    public Weather getCurrent() {
        return WEATHER_ENTITY_MAPPER.toModel(weatherRepository.findFirstByOrderByIdDesc());
    }

    @Override
    public List<Weather> getAllByDataBetween(Instant from, Instant to) {

        return WEATHER_ENTITY_MAPPER.toListModel(weatherRepository.findAllByDataBetween(from, to));
    }

}
