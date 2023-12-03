package by.nenartovich.weather_analyzer.api.rest_api.model;

import java.io.Serializable;
import java.util.Date;

public record RequestDto(Date from,
                         Date to) implements Serializable {
}
