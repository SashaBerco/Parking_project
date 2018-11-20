package com.example.utm.demo.parking.services;

import com.example.utm.demo.parking.exceptions.AlreadyExistsException;
import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Override
    public void saveCar(Car car) throws AlreadyExistsException {
        if (carRepository.getById(car.getId()) != null) {
            throw new AlreadyExistsException("car already exists");
        }

        carRepository.store(car);
    }

    @Override
    public void editCar(Long carId, Car car) throws NotFoundException {
        if (carRepository.getById(carId) == null) {
            throw new NotFoundException("car does not exist");
        }

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
