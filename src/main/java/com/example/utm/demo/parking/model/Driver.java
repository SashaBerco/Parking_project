package com.example.utm.demo.parking.model;

public class Driver {

   private String name;
   private String surname;
   private String licenseNumber;

   public Driver(){}

    public Driver(String name, String surname, String licenseNumber) {
        this.name = name;
        this.surname = surname;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
