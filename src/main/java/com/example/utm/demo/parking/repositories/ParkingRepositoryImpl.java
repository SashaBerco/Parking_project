package com.example.utm.demo.parking.repositories;

import com.example.utm.demo.parking.exceptions.NotFoundException;
import com.example.utm.demo.parking.models.Car;
import com.example.utm.demo.parking.models.ParkingLot;
import com.example.utm.demo.parking.models.ParkingPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

    private CarRepository carRepository;

    private static Map<Long, ParkingLot> parkingLots = new HashMap<>();

    static {
        Map<Long, ParkingPlace> parkingPlaces1 = new HashMap<>();
        parkingPlaces1.put(0L, new ParkingPlace(0L));
        parkingPlaces1.put(1L, new ParkingPlace(1L));
        parkingPlaces1.put(2L, new ParkingPlace(2L));
        parkingPlaces1.put(3L, new ParkingPlace(3L));
        parkingPlaces1.put(4L, new ParkingPlace(4L));
        parkingLots.put(0L, new ParkingLot(0L,
                "some address 54", parkingPlaces1));
    }

    @Override
    public ParkingPlace getParkingPlace(Long parkingPlaceId, Long placeId) {
        return parkingLots.get(parkingPlaceId).getPlaceById(placeId);
    }

    @Override
    public List<ParkingPlace> getAllParkingPlaces(Long parkingPlaceId) {
        return new ArrayList<>(parkingLots.get(parkingPlaceId).getPlaces().values());
    }

    @Override
    public ParkingLot getParkingLot(Long parkingLotId) {
        return parkingLots.get(parkingLotId);
    }

    @Override
    public List<ParkingLot> getAllParkingLots() {
        return new ArrayList<>(parkingLots.values());
    }

    @Override
    public void assignCar(Long parkingPlaceId, Long placeId, Long carId) throws NotFoundException {
        Car car = carRepository.getById(carId);
        if (car == null) {
            throw new NotFoundException("car not found");
        }
        ParkingLot lot = parkingLots.get(parkingPlaceId);
        if (lot == null) {
            throw new NotFoundException("parking lot not found");
        }
        ParkingPlace place = lot.getPlaceById(placeId);
        if (place == null) {
            throw new NotFoundException("parking place not found");
        }
        place.setAssignedCar(car);
    }

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
