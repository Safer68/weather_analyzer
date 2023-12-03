package by.nenartovich.weather_analyzer.adapter.feign_adapter.mapper;

import by.nenartovich.weather_analyzer.adapter.feign_adapter.model.ResponseClientWeather;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WeatherMapper {
    WeatherMapper WEATHER_MAPPER = Mappers.getMapper(WeatherMapper.class);

    @Mapping(target = "temperature", source = "current.temperature")
    @Mapping(target = "windSpeed", source = "current.windSpeed")
    @Mapping(target = "pressure", source = "current.pressure")
    @Mapping(target = "humidity", source = "current.humidity")
    @Mapping(target = "condition", source = "current.condition.description")
    @Mapping(target = "city", source = "location.region")
    Weather mapToDomain(ResponseClientWeather clientWeather);
}
