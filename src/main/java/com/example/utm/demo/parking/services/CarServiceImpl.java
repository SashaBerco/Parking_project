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
        //TODO: check if car exists and if it does not do store else throw CarAlreadyExists
        carRepository.store(car);
    }

    @Override
    public void editCar(Long carId, Car car) {
        //TODO: check if car exists and if it does do store else throw CarNotFoundException
        carRepository.store(car);
    }

    @Override
    public Car getCar(Long carId) {
        return carRepository.getById(carId);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAll();
    }

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
