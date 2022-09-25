package com.kochkina.station.model;

public class Bicycle extends Transport {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для велосипеда");
    }
}

