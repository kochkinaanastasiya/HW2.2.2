package com.kochkina.station.model;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для машины");
    }

    @Override
    public void serviceTransport(){
        updateTyre();
        checkEngine();
    }

    private void checkEngine() {

        System.out.println("Проверяем двигатель машины");
    }

}