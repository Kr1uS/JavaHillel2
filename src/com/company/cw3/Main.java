package com.company.cw3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car [] cars = new Car[1];

        inputCars(input, cars);
        showCars(cars);

    }

    public static void inputCars(Scanner input, Car[] cars){
        for (int i = 0; i < cars.length; i++){
            String maxSpeed;
            String mark;
            String color;
            String vinNumber;

            System.out.println("Enter max speed: \n");
            maxSpeed = input.nextLine();
            maxSpeed = checkMaxSpeed(maxSpeed, input);

            System.out.println("Enter mark: \n");
            mark = input.nextLine();
            mark = checkMark(mark, input);

            System.out.println("Enter color: \n");
            color = input.nextLine();

            System.out.println("Enter vin num: \n");
            vinNumber = input.nextLine();

            cars[i] = new Car(maxSpeed, mark, color, vinNumber);
        }
    }

    private static String checkMark(final String mark, final Scanner input){
        String newMark = mark;
        if (newMark.toLowerCase(Locale.ROOT).contains("lada")){
            System.out.println("Try again pls");
            newMark = checkMark(input.nextLine(), input);
        }
        return newMark;
    }

    private static String checkMaxSpeed(String maxSpeed, Scanner input) {
        String carSpeed = maxSpeed;
        if (maxSpeed.matches("\\d+")){
            return carSpeed;
        }else{
            System.out.println("Enter a number pls");
            carSpeed = checkMaxSpeed(input.nextLine(), input);
        }
        return carSpeed;
    }

    public static void showCars(Car[] cars){
        for (Car car : cars){
            System.out.println(car.getMark() + " " + car.getColor());
        }
    }
}
