package by.nenartovich.weather_analyzer.adapter.feign_adapter.client;

import by.nenartovich.weather_analyzer.adapter.feign_adapter.model.ResponseClientWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "weatherClient", url = "${feignClient.weatherServiceUrl}")
public interface WeatherClient {

    @GetMapping(headers = {"X-RapidAPI-Key=${feignClient.X-RapidAPI-Key}"})
    ResponseClientWeather getClientInfo();
}
