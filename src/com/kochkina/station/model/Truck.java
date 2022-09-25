package com.kochkina.station.model;

public class Truck extends Car {
    @Override
    public void checkAll(){
        super.checkAll();
        checkTrailer();
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
