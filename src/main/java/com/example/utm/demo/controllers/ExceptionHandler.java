package com.example.utm.demo.controllers;

import com.example.utm.demo.parking.exceptions.AlreadyExistsException;
import com.example.utm.demo.parking.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ResponseBody
    public Map<String, Boolean> notFoundException(NotFoundException e) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("success", false);
        return map;
    }
}
