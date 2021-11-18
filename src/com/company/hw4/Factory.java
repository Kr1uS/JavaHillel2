package com.company.hw4;

public class Factory {

    public static Car produce(String type, boolean autoTransmission) {
        Car car = new Car ();
        car.setType(type);
        car.setAutoTransmission(autoTransmission);
        car.produce();
        return car;
    }

}
