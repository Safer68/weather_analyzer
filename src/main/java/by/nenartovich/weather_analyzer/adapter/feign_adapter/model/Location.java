package by.nenartovich.weather_analyzer.adapter.feign_adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Location(String region) implements Serializable {

}
