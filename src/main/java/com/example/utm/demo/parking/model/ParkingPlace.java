package com.example.utm.demo.parking.model;

import com.example.utm.demo.parking.model.enums.State;

public class ParkingPlace {

   private Long id;
   private State state;
   private String carNumber;

   public ParkingPlace(){}

    public ParkingPlace(State state, String carNumber) {
        this.state = state;
        this.carNumber = carNumber;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }



}
