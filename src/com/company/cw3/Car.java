package com.company.cw3;

public class Car {
    private String maxSpeed;
    private String mark;
    private String color;
    private String vinNumber;
    private double oilPressure;

    public Car(String maxSpeed, String mark, String color, String vinNumber) {
        this.maxSpeed = maxSpeed;
        this.mark = mark;
        this.color = color;
        this.vinNumber = vinNumber;
        this.oilPressure = oilPressure;
    }

    //
//  GETTERS
//
    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public double getOilPressure() {
        return oilPressure;
    }
//
// SETTERS
//
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setOilPressure(double oilPressure) {
        this.oilPressure = oilPressure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vinNumber.equals(car.vinNumber);
    }
}
