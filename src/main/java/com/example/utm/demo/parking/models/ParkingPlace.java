package com.example.utm.demo.parking.models;

import java.util.Set;

public class ParkingPlace {
    private Long id;
    private Car assignedCar;
    private Set<Booking> bookings;

    public ParkingPlace(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car getAssignedCar() {
        return assignedCar;
    }

    public void setAssignedCar(Car assignedCar) {
        this.assignedCar = assignedCar;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }
}
