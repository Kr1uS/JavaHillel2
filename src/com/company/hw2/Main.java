package com.company.hw2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CAR1");
        Car car1 = new Car(inputInt("Enter max speed:"), inputFloat("Enter engine V:"), inputInt("Enter weight:"),
                inputString("Enter vin number:"));
        System.out.println("CAR2");
        Car car2 = new Car(inputInt("Enter max speed:"), inputFloat("Enter engine V:"), inputInt("Enter weight:"),
                inputString("Enter vin number:"));

        System.out.println("Equals: " + car1.equals(car2));
        System.out.println(car1.compare(car2));

    }

    public static int inputInt(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        if (input.hasNextInt()) {
            return input.nextInt();
        }else {
            System.out.println("Error, please, try again.");
            return inputInt(text);
        }

    }

    public static float inputFloat(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        if (input.hasNextFloat()) {
            return input.nextFloat();
        }else {
            System.out.println("Error, please, try again.");
            return inputFloat(text);
        }

    }

    public static String inputString(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        if (input.hasNextLine()) {
            return input.nextLine();
        }else {
            System.out.println("Error, please, try again.");
            return inputString(text);
        }
    }
}
