package com.kochkina.station;

import com.kochkina.station.model.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Car car2 = new Car("Porshe", 4);
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("Газель", 4);
        Truck truck2 = new Truck("Фура", 12);
        truck.setModelName("track1");
        truck2.setModelName("track2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("Стелс", 2);
        Bicycle bicycle2 = new Bicycle("Марс", 2);
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}



