package by.nenartovich.weather_analyzer.api.rest_api.error;

import java.time.ZonedDateTime;

public record ErrorResponse(int statusCode, String message, ZonedDateTime timeStamp) {
}

