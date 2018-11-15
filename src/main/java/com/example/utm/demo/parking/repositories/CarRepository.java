package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.models.Car;

public interface CarRepository {
    void store(Car car);

    Car getById(Long id);

}
