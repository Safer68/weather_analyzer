package by.nenartovich.weather_analyzer.api.rest_api.v1;

import by.nenartovich.weather_analyzer.api.rest_api.model.RequestDto;
import by.nenartovich.weather_analyzer.api.rest_api.model.ResponseWeatherDto;
import by.nenartovich.weather_analyzer.api.rest_api.model.ResponseWeatherSpecifiedPeriodDto;
import by.nenartovich.weather_analyzer.service.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static by.nenartovich.weather_analyzer.api.rest_api.mapper.WeatherDtoMapper.WEATHER_MAPPER;
import static by.nenartovich.weather_analyzer.api.rest_api.mapper.WeatherSpecifiedPeriodMapper.WEATHER_SPECIFIED_PERIOD_MAPPER;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/weather")
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/current")
    @Operation(summary = "Save client")
    public ResponseEntity<ResponseWeatherDto> getCurrent() {
        ResponseWeatherDto responseWeatherDto = WEATHER_MAPPER.toDto(weatherService.getCurrent());
        return new ResponseEntity<>(responseWeatherDto, HttpStatus.OK);
    }

    @PostMapping("/Period")
    public ResponseEntity<ResponseWeatherSpecifiedPeriodDto> updateContacts(@RequestBody RequestDto contacts) {
        ResponseWeatherSpecifiedPeriodDto responseWeatherSpecifiedPeriodDto =
                WEATHER_SPECIFIED_PERIOD_MAPPER.toDto(weatherService.getPeriodWeather(contacts.from().toInstant(),
                        contacts.to().toInstant()));
        return new ResponseEntity<>(responseWeatherSpecifiedPeriodDto, HttpStatus.OK);
    }
}
