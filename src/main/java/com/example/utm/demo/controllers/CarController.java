package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/car")
public class CarController {

    private CarService carService;

    @RequestMapping(method = RequestMethod.POST)
    public void saveCar(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void editCar(Car car) {
        carService.editCar(car);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Car getCar(Long carId) {
        return carService.getCar(carId);
    }

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
}
