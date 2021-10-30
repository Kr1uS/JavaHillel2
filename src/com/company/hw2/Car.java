package com.company.hw2;

public class Car {
    private int maxSpeed;
    private float engine;
    private int weight;
    private String vinNumber;

    public Car(int maxSpeed, float engine, int weight, String vinNumber) {
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.weight = weight;
        this.vinNumber = vinNumber;
    }


//  GETTERS

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public float getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getVinNumber() {
        return vinNumber;
    }


// SETTERS


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vinNumber.equals(car.vinNumber);
    }

    public String compare(Car car){
        int score1 = 0;
        int score2 = 0;
        if (maxSpeed > car.getMaxSpeed()) {
            score1 += 1;
        }else if (maxSpeed < car.getMaxSpeed()) {
            score2 += 1;
        }else {
            score1 += 1;
            score2 += 1;
        }
        if (engine > car.getEngine()) {
            score1 += 1;
        }else if (engine < car.getEngine()) {
            score2 += 1;
        } else {
            score1 += 1;
            score2 += 1;
        }
        if (weight > car.getWeight()) {
            score2 += 1;
        }else if (weight < car.getWeight()) {
            score1 += 1;
        } else {
            score1 += 1;
            score2 += 1;
        }
        if (score1 > score2) {
            return "Car1 will probably win the race";
        }else if (score1 < score2) {
            return "Car2 will probably win the race";
        }else {
            return "There will probably be a draw";
        }
    }
}
