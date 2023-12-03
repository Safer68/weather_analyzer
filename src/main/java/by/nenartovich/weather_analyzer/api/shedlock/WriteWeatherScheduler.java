package by.nenartovich.weather_analyzer.api.shedlock;

import by.nenartovich.weather_analyzer.service.SchedulerService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
public class WriteWeatherScheduler {
    private final SchedulerService schedulerService;

    @Scheduled(fixedRateString = "${shedlock.writeWeatherFixedRate}", timeUnit = TimeUnit.MINUTES)
    public void scheduledTask() {
        schedulerService.writeWeather();
    }
}
