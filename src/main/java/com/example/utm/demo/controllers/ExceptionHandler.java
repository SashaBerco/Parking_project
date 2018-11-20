package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.exceptions.AlreadyExistsException;
import com.example.utm.demo.parking.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Object> notFoundException(NotFoundException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("message", e.getMessage());
        return map;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(AlreadyExistsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> alreadyExistsException(AlreadyExistsException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("message", e.getMessage());
        return map;
    }
}
