package com.bellintegrator.weatherbrokerthree;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.naming.NamingException;
import javax.sql.DataSource;

@SpringBootApplication
public class WeatherbrokerthreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherbrokerthreeApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		ObjectMapper mapper = new ObjectMapper();
		converter.setObjectMapper(mapper);
		restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setContentType("text/html");
		return viewResolver;
	}

}
