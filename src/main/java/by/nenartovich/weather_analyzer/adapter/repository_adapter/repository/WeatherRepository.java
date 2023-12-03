package by.nenartovich.weather_analyzer.adapter.repository_adapter.repository;

import by.nenartovich.weather_analyzer.adapter.repository_adapter.entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Long>, JpaSpecificationExecutor<WeatherEntity> {

    WeatherEntity findFirstByOrderByIdDesc();

    List<WeatherEntity> findAllByDataBetween(Instant instant, Instant instant1);
}