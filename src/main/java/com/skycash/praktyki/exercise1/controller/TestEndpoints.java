package com.skycash.praktyki.exercise1.controller;

import com.skycash.praktyki.exercise1.model.Car;
import com.skycash.praktyki.exercise1.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestEndpoints {

    private final CarService carService;

    @GetMapping("car/get")
    public ResponseEntity<List<Car>> getCar() {
        return new ResponseEntity<>(carService.getCar(), HttpStatus.OK);
    }

    @PostMapping("car/add")
    public ResponseEntity addCar (@RequestBody Car car) {
        return new ResponseEntity<>(carService.addCar(car), HttpStatus.OK);
    }

    @PatchMapping("car/update/{id}")
    public ResponseEntity updateCar (@RequestParam("id") Integer id, @RequestBody Car carUpdated) {
        return new ResponseEntity<>(carService.updateCar(id, carUpdated), HttpStatus.OK);
    }

    @DeleteMapping("car/delete/{id}")
    public ResponseEntity deleteCar (@RequestParam("id") Integer id) {
        return new ResponseEntity<>(carService.deleteCar(id), HttpStatus.OK);
    }

}
