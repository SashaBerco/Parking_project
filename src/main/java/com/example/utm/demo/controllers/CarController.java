package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.exceptions.AlreadyExistsException;
import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    private CarService carService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.OK)
    public void saveCar(@RequestBody Car car) throws AlreadyExistsException {
        carService.saveCar(car);
    }

    @RequestMapping(value = "/{carId}/edit", method = RequestMethod.PATCH)
    public void editCar(@PathVariable Long carId,
                        @RequestBody Car car) throws NotFoundException {
        carService.editCar(carId, car);
    }

    @RequestMapping(value = "/{carId}", method = RequestMethod.GET)
    public Car getCar(@PathVariable Long carId) {
        return carService.getCar(carId);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
}
