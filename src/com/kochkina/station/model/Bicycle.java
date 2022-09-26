package com.kochkina.station.model;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {

        System.out.println("Меняем покрышку для велосипеда");
    }
    @Override
    public void serviceTransport(){
        updateTyre();
    }
}




