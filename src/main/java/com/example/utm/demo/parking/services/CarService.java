package com.example.utm.demo.parking.services;

import com.example.utm.demo.parking.exceptions.AlreadyExistsException;
import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car) throws AlreadyExistsException;

    void editCar(Long carId, Car car) throws NotFoundException;

    Car getCar(Long carId);

    List<Car> getAllCars();
}
