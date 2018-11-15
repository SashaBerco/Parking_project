package com.example.utm.demo.parking.services;

import com.example.utm.demo.parking.models.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);

    void editCar(Long carId, Car car);

    Car getCar(Long carId);

    List<Car> getAllCars();
}
