package com.bellintegrator.weatherbrokerthree.dao;

import com.bellintegrator.weatherbrokerthree.model.WeatherCondition;
import org.springframework.data.repository.CrudRepository;

public interface WeatherConditionRepository extends CrudRepository<WeatherCondition, Long> {
}
