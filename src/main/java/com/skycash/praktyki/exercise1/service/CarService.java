package com.skycash.praktyki.exercise1.service;

import com.skycash.praktyki.exercise1.model.Car;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.List;

public class CarService {
//
    private List<Car> cars = new LinkedList<>();

    public List<Car> getCar() {
        return this.cars;
    }

    public boolean addCar(Car car) {
        return this.cars.add(car);
    }

    public boolean updateCar(Integer id, Car carUpdated) {
        Car carFromStream = cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst().orElseThrow(NotImplementedException::new);

        carFromStream.setMarka(carUpdated.getMarka());
        carFromStream.setModel(carUpdated.getModel());
        carFromStream.setPrzebieg(carUpdated.getPrzebieg());
        return false;
    }

    public boolean deleteCar(Integer id) {
        Car carFromStream = cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst().orElseThrow(NotImplementedException::new);
        cars.remove(carFromStream);
        return false;
    }
}