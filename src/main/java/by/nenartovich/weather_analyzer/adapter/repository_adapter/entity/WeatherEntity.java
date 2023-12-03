package by.nenartovich.weather_analyzer.adapter.repository_adapter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "weather")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data", nullable = false)
    private Instant data;

    @Column(name = "temperature", nullable = false)
    private Double temperature;

    @Column(name = "wind_speed", nullable = false)
    private Double windSpeed;

    @Column(name = "pressure", nullable = false)
    private Double pressure;

    @Column(name = "humidity", nullable = false)
    private Double humidity;

    @Column(name = "description", nullable = false, length = 50)
    private String description;

    @Column(name = "city", nullable = false, length = 50)
    private String city;
}