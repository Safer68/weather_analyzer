package by.nenartovich.weather_analyzer.adapter.repository_adapter.mapper;

import by.nenartovich.weather_analyzer.adapter.repository_adapter.entity.WeatherEntity;
import by.nenartovich.weather_analyzer.domain.model.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WeatherEntityMapper {
    WeatherEntityMapper WEATHER_ENTITY_MAPPER = Mappers.getMapper(WeatherEntityMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", source = "condition")
    WeatherEntity toEntity(Weather weather);

    @Mapping(target = "condition", source = "description")
    Weather toModel(WeatherEntity entity);
    List<Weather> toListModel(List<WeatherEntity> weatherEntities);
}
