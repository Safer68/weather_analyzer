package by.nenartovich.weather_analyzer.adapter.feign_adapter;

import by.nenartovich.weather_analyzer.adapter.feign_adapter.client.WeatherClient;
import by.nenartovich.weather_analyzer.adapter.feign_adapter.model.ResponseClientWeather;
import by.nenartovich.weather_analyzer.domain.api.ClientAdapter;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static by.nenartovich.weather_analyzer.adapter.feign_adapter.mapper.WeatherMapper.WEATHER_MAPPER;

@Component
@RequiredArgsConstructor
public class ClientAdapterImpl implements ClientAdapter {
    private final WeatherClient weatherClient;

    @Override
    public Weather getWeather() {
        ResponseClientWeather responseClientWeather = weatherClient.getClientInfo();
        return WEATHER_MAPPER.mapToDomain(responseClientWeather);
    }
}
