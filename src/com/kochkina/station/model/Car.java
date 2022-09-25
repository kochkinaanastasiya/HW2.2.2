package com.kochkina.station.model;

public class Car extends Transport {

    public void updateTyre() {
        System.out.println("Меняем покрышку для машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}