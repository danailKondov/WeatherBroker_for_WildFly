package com.bellintegrator.weatherbrokerthree.dao;

import com.bellintegrator.weatherbrokerthree.model.WeatherForecast;
import org.springframework.data.repository.CrudRepository;

public interface WeatherForecastRepository extends CrudRepository<WeatherForecast, Long> {
}
