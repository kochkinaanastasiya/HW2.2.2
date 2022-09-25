package com.kochkina.station.model;

public class Car extends Transport {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для машины");
    }

    public void checkAll(){
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

}