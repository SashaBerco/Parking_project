package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.models.ParkingLot;
import com.example.utm.demo.parking.models.ParkingPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

    private CarRepository carRepository;

    private static Map<Long, ParkingLot> parkingLots = Map.of(0L, new ParkingLot(
            0L,
            "some address 54",
            Map.of(
                    0L, new ParkingPlace(0L),
                    1L, new ParkingPlace(1L),
                    2L, new ParkingPlace(2L),
                    3L, new ParkingPlace(3L)
            )
    ));

    @Override
    public ParkingPlace getParkingPlace(Long parkingPlaceId, Long placeId) {
        return parkingLots.get(parkingPlaceId).getPlaceById(placeId);
    }

    @Override
    public void assignCar(Long parkingPlaceId, Long placeId, Long carId) {
        parkingLots.get(parkingPlaceId).getPlaceById(placeId).setAssignedCar(carRepository.getById(carId));
    }

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
