package com.company.hw3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        float number = inputFloat("Enter a number:");

        int[] nums = new int[1];
        String[] opers = new String[1];
        int result;

        for (int i = 1; i > 0; i++) {
            if (i % 2 != 0) {
                String oper = inputString("Enter an operator:");
                if (oper.equals("=")) break;
            } else {
                float num = inputFloat("Enter a number:");

            }
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
