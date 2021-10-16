package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car [] cars = new Car[5];

        inputCars(input, cars);

//        System.out.println(bmw.equals(bmw1));

    }

    public static void inputCars(Scanner input, Car[] cars){
        for (int i = 0; i < cars.length; i++){
            int maxSpeed;
            String mark;
            String color;
            String vinNumber;

            System.out.println("Enter max speed: ");
            maxSpeed = input.nextInt();
            System.out.println("Enter mark: ");
            mark = input.nextLine();
            System.out.println("Enter color: ");
            color = input.nextLine();
            System.out.println("Enter vin num: ");
            vinNumber = input.nextLine();

            cars[i] = new Car(maxSpeed, mark, color, vinNumber);
        }
    }

}
