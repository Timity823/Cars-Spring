package com.cars.carsspring.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/cars")
public class CarController {
    private List<Car> cars = new ArrayList<>();
    @GetMapping
    public List<Car> getAllCars(){

        return null;
    }

    @GetMapping
    public List<Car> getCarById(@PathVariable Long id){
        return null;
    }

}
