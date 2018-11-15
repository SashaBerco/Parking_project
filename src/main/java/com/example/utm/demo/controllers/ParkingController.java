package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.models.ParkingPlace;
import com.example.utm.demo.parking.repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/parking")
public class ParkingController {

    private ParkingRepository parkingRepository;

    @RequestMapping(value = "/{parkingPlaceId}/place/{placeId}", method = RequestMethod.GET)
    public ParkingPlace getParkingPlace(@PathVariable Long parkingPlaceId,
                                        @PathVariable Long placeId) {
        return parkingRepository.getParkingPlace(parkingPlaceId, placeId);
    }

    @RequestMapping(value = "/{parkingPlaceId}/place/{placeId}/assign-car", method = RequestMethod.POST)
    public void assignCar(@PathVariable Long parkingPlaceId,
                          @PathVariable Long placeId,
                          @RequestParam("car_id") Long carId) {
        parkingRepository.assignCar(parkingPlaceId, placeId, carId);
    }

    @Autowired
    public void setParkingRepository(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
}
