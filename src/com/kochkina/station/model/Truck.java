package com.kochkina.station.model;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку для грузовика");
    }

    @Override
    public void serviceTransport(){
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    private void checkEngine() {

        System.out.println("Проверяем двигатель грузовика");
    }
    private void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }

}
