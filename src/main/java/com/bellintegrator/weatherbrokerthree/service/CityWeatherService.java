package com.bellintegrator.weatherbrokerthree.service;

public interface CityWeatherService {

    void getWeatherForCity(String cityName, String degreeParam, String typeInfo);
}
