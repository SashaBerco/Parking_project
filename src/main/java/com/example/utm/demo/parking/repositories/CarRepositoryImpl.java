package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.models.Car;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private Map<Long, Car> cars = new HashMap<>();

    @Override
    public void store(Car car) {
        if (car.getId() == null) {
            cars.put(cars.get((long) cars.size()).getId(), car);
            return;
        }

        cars.put(car.getId(), car);
    }

    @Override
    public Car getById(Long id) {
        return cars.get(id);
    }
}
