package com.example.utm.demo.parking.services;

import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Override
    public void saveCar(Car car) {
        carRepository.store(car);
    }

    @Override
    public void editCar(Car car) {
        carRepository.store(car);
    }

    @Override
    public Car getCar(Long carId) {
        return carRepository.getById(carId);
    }

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
