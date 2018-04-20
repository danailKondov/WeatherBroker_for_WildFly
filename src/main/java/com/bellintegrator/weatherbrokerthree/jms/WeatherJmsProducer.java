package com.bellintegrator.weatherbrokerthree.jms;

import com.bellintegrator.weatherbrokerthree.model.WeatherCondition;
import com.bellintegrator.weatherbrokerthree.model.WeatherForecast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Topic;

@Component
public class WeatherJmsProducer {

    private final Logger log = LoggerFactory.getLogger(WeatherJmsProducer.class);

    private JmsTemplate jmsTemplate;

    @Resource(lookup = "java:jboss/exported/jms/topic/weathercondition") // or "mappedName"
    private Topic actualTopic;

    @Resource(lookup = "java:jboss/exported/jms/topic/weatherforecast")
    private Topic forecastTopic;

    @Autowired
    public WeatherJmsProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendActualWeather(final WeatherCondition condition) {
        log.info("sending actual weather in JMS...");
        jmsTemplate.convertAndSend(actualTopic, condition);
        log.info("actual weather was send");
    }

    public void sendWeatherForecast(final WeatherForecast forecast) {
        log.info("sending forecast weather in JMS...");
        jmsTemplate.convertAndSend(forecastTopic, forecast);
        log.info("forecast was send");
    }
}
