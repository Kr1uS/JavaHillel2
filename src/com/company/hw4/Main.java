package com.company.hw4;

public class Main {

    public static void main(String[] args) {
        Factory f = new Factory();

        Car a1 = f.produce("sedan", true);
        Car a2 = f.produce("off-road", false);

        a1.driveOffRoad();
        a2.driveOffRoad();
        a1.transmission();
        a2.transmission();
    }

}
