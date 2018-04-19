package com.bellintegrator.weatherbrokerthree.controller.impl;

import com.bellintegrator.weatherbrokerthree.controller.CityController;
import com.bellintegrator.weatherbrokerthree.service.CityWeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather")
public class CityControllerImpl implements CityController {

    private final Logger log = LoggerFactory.getLogger(CityControllerImpl.class);

    private CityWeatherService service;

    @Autowired
    public CityControllerImpl(CityWeatherService service) {
        this.service = service;
    }

    /**
     * Метод обрабатывает запрос на получение погоды.
     *
     * @param cityName имя города
     * @param degreeParam единицы измерения температуры
     * @param typeInfo прогноз погоды или актуальное состояние
     */
    @GetMapping(value = "/cityname")
    public void getWeatherForCity(@RequestParam("cityName") String cityName, @RequestParam("degreeParam") String degreeParam, @RequestParam("typeInfo") String typeInfo) {
        log.info("New request for weather with params: " + cityName + "; " + degreeParam + "; " + typeInfo);
        service.getWeatherForCity(cityName, degreeParam, typeInfo);
    }
}
