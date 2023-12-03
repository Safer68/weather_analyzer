package by.nenartovich.weather_analyzer.api.rest_api.mapper;

import by.nenartovich.weather_analyzer.api.rest_api.model.ResponseWeatherSpecifiedPeriodDto;
import by.nenartovich.weather_analyzer.domain.model.PeriodWeather;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WeatherSpecifiedPeriodMapper {
    WeatherSpecifiedPeriodMapper WEATHER_SPECIFIED_PERIOD_MAPPER = Mappers.getMapper(WeatherSpecifiedPeriodMapper.class);

    ResponseWeatherSpecifiedPeriodDto toDto(PeriodWeather periodWeather);
}