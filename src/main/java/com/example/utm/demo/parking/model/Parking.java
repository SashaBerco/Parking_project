package com.example.utm.demo.parking.model;

import java.util.Map;

public class Parking {

    private String address;
    private Map<String, ParkingPlace> places;

    public Parking(){}

    public Parking(String address, Map<String,ParkingPlace> places) {
        this.address = address;
        this.places = places;
    }


    public ParkingPlace getPlaceById(String id){

        return places.get(id);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, ParkingPlace> getPlaces() {
        return places;
    }

    public void setPlaces(Map<String, ParkingPlace> places) {
        this.places = places;
    }



}
