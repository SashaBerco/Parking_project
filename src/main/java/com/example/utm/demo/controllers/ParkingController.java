package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.ParkingLot;
import com.example.utm.demo.parking.models.ParkingPlace;
import com.example.utm.demo.parking.repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/parking")
public class ParkingController {

    private ParkingRepository parkingRepository;

    @RequestMapping(value = "/{parkingPlaceId}/place/{placeId}", method = RequestMethod.GET)
    public ParkingPlace getParkingPlace(@PathVariable Long parkingPlaceId,
                                        @PathVariable Long placeId) {
        return parkingRepository.getParkingPlace(parkingPlaceId, placeId);
    }

    @RequestMapping(value = "/{parkingLotId}/place", method = RequestMethod.GET)
    public List<ParkingPlace> getAllParkingPlaces(@PathVariable Long parkingLotId) {
        return parkingRepository.getAllParkingPlaces(parkingLotId);
    }

    @RequestMapping(value = "/{parkingLotId}", method = RequestMethod.GET)
    public ParkingLot getParkingLot(@PathVariable Long parkingLotId) {
        return parkingRepository.getParkingLot(parkingLotId);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ParkingLot> getAllParkingLots() {
        return parkingRepository.getAllParkingLots();
    }

    @RequestMapping(value = "/{parkingPlaceId}/place/{placeId}/assign", method = RequestMethod.POST)
    public void assignCar(@PathVariable Long parkingPlaceId,
                          @PathVariable Long placeId,
                          @RequestParam("car_id") Long carId) throws NotFoundException {
        parkingRepository.assignCar(parkingPlaceId, placeId, carId);
    }

    @Autowired
    public void setParkingRepository(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
}
