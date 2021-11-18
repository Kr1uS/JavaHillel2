package com.company.hw4;

import java.util.Locale;

public class Car implements CarI {
    private String type;
    private boolean autoTransmission;
    private boolean produced;

    public void setType(String type) {
        this.type = type;
    }

    public void setAutoTransmission(boolean autoTransmission) {
        this.autoTransmission = autoTransmission;
    }

    public String getType() {
        return type;
    }

    public boolean isAutoTransmission() {
        return autoTransmission;
    }

    void produce() {
        produced = true;
    }

    @Override
    public void driveOnRoad() {
        System.out.println("drive");
    }

    @Override
    public void driveOffRoad() {
        if (type.toLowerCase(Locale.ROOT).equals("sedan")) {
            System.out.println("crash");
        } else {
            System.out.println("drive");
        }
    }

    @Override
    public void turn(String side) {
        System.out.println("turn " +  side.toLowerCase(Locale.ROOT));
    }

    @Override
    public void transmission() {
        if (autoTransmission) {
            System.out.println("automatic");
        } else {
            System.out.println("manual");
        }
    }
}
