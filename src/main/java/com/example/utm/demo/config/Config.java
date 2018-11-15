package com.example.utm.demo.config;

import com.example.utm.demo.parking.services.CarService;
import com.example.utm.demo.parking.services.CarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CarService carService() {
        return new CarServiceImpl();
    }
}
