package by.nenartovich.weather_analyzer.adapter.repository_adapter.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("by.nenartovich.weather_analyzer.adapter.repository_adapter.entity")
@EnableJpaRepositories("by.nenartovich.weather_analyzer.adapter.repository_adapter.repository")
public class RepositoryConfig {
}
