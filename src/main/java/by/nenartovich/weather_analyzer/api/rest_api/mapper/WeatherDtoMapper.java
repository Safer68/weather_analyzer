package by.nenartovich.weather_analyzer.api.rest_api.mapper;

import by.nenartovich.weather_analyzer.api.rest_api.model.ResponseWeatherDto;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WeatherDtoMapper {
    WeatherDtoMapper WEATHER_MAPPER = Mappers.getMapper(WeatherDtoMapper.class);

    ResponseWeatherDto toDto(Weather weather);
}