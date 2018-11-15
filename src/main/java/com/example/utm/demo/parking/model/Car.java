package com.example.utm.demo.parking.model;

public class Car {

   private Driver owner;
   private String number;
   private String model;

   public Car(){}

    public Car(Driver owner, String number, String model) {
        this.owner = owner;
        this.number = number;
        this.model = model;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
