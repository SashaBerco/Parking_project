package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.ParkingLot;
import com.example.utm.demo.parking.models.ParkingPlace;

import java.util.List;

public interface ParkingRepository {
    ParkingPlace getParkingPlace(Long parkingPlaceId, Long placeId);

    List<ParkingPlace> getAllParkingPlaces(Long parkingPlaceId);

    ParkingLot getParkingLot(Long parkingLotId);

    List<ParkingLot> getAllParkingLots();

    void assignCar(Long parkingPlaceId, Long placeId, Long carId) throws NotFoundException;
}
