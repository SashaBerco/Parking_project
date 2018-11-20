package com.example.utm.demo.parking.models;

public class Car {

    private Long id;
    private Driver driver;
    private String number;
    private String model;

    public Car(Long id, Driver driver, String number, String model) {
        this.id = id;
        this.driver = driver;
        this.number = number;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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
