package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.models.Driver;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private static Map<Long, Car> cars = new HashMap<>();

    static {
        cars.put(0L, new Car(0L, new Driver(0L,"Paulescu" ,"Paul"), "KRK270", "Porsche"));
    }

    @Override
    public void store(Car car) {
        if (car.getId() == null) {
            cars.put(new Random().nextLong(), car);
            return;
        }

        cars.put(car.getId(), car);
    }

    @Override
    public Car getById(Long id) {
        return cars.get(id);
    }

    @Override
    public List<Car> getAll() {
        return new ArrayList<>(cars.values());
    }
}
