package by.nenartovich.weather_analyzer.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PeriodWeather {
    private Double averageTemp;
    private Double minWindSpeed;
    private Double maxWindSpeed;
    private Double minPressure;
    private Double maxPressure;
    private Double minHumidity;
    private Double maxHumidity;
}
