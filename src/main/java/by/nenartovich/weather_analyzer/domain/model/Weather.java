package by.nenartovich.weather_analyzer.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    private Long id;
    private Instant data;
    private Double temperature;
    private Double windSpeed;
    private Double pressure;
    private Double humidity;
    private String condition;
    private String city;
}
