package com.example.utm.demo.parking.models;

import java.util.Map;

public class ParkingLot {
    private Long id;
    private String address;
    private Map<Long, ParkingPlace> places;

    public ParkingLot(Long id, String address, Map<Long, ParkingPlace> places) {
        this.id = id;
        this.address = address;
        this.places = places;
    }

    public ParkingPlace getPlaceById(Long id) {
        return places.get(id);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Long, ParkingPlace> getPlaces() {
        return places;
    }

    public void setPlaces(Map<Long, ParkingPlace> places) {
        this.places = places;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
