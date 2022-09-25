package com.kochkina.station.model;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.wheelsCount; i++) {
            transport.updateTyre();
        }
        if(transport instanceof Car) {
            ((Car) transport).checkEngine();
            if(transport instanceof Truck){
                ((Truck) transport).checkTrailer();
            }
        }
    }
}