package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.models.ParkingPlace;

public interface ParkingRepository {
    ParkingPlace getParkingPlace(Long parkingPlaceId, Long placeId);

    void assignCar(Long parkingPlaceId, Long placeId, Long carId);
}
