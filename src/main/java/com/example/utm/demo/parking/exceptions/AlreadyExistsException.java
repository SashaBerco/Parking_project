package com.example.utm.demo.parking.exceptions;

public class AlreadyExistsException extends Throwable {
    private String message;

    public AlreadyExistsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
