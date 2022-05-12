package com.skycash.praktyki.exercise1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private Integer id;
    private String marka;
    private String model;
    private int przebieg;
}
