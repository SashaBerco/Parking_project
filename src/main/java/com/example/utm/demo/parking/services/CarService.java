package com.example.utm.demo.parking.services;

import com.example.utm.demo.parking.models.Car;

public interface CarService {
    void saveCar(Car car);

    void editCar(Car car);

    Car getCar(Long carId);
}
