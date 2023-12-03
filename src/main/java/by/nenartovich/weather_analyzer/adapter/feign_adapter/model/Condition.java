package by.nenartovich.weather_analyzer.adapter.feign_adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Condition(@JsonProperty("text") String description) implements Serializable {
}
