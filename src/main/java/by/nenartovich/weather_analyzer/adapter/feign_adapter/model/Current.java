package by.nenartovich.weather_analyzer.adapter.feign_adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Current(@JsonProperty("temp_c")
                      Double temperature,
                      @JsonProperty("wind_mph")
                      Double windSpeed,
                      @JsonProperty("pressure_mb")
                      Double pressure,
                      Double humidity,
                      @JsonProperty("condition") Condition condition) implements Serializable {
}