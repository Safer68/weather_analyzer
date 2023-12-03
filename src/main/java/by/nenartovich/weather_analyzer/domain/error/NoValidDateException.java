package by.nenartovich.weather_analyzer.domain.error;

public class NoValidDateException extends RuntimeException {

    public NoValidDateException(String message) {
        super(message);
    }
}
