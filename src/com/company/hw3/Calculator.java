package com.company.hw3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        float[] nums = new float[1];
        String[] opers = new String[1];
        float result = inputFloat("Enter a number:");
        ;

        for (int i = 0; i >= 0; i++) {

            String oper = inputString("Enter an operator:");
            opers[i] = oper;
            opers = extendArrayStr(opers);

            if (oper.equals("=")) {
                System.out.println(result);
                break;
            }

            float num = inputFloat("Enter a number:");
            nums[i] = num;
            nums = extendArrayFloat(nums);

            result = operate(result, nums[i], opers[i]);

//            switch (opers[i]) {
//                case ("+"):
//                    result += nums[i];
//                case ("-"):
//                    result -= nums[i];
//                case ("*"):
//                    result *= nums[i];
//                case ("/"):
//                    result /= nums[i];
//            }
        }
    }

    private static float inputFloat(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        if (input.hasNextFloat()) {
            return input.nextFloat();
        } else {
            System.out.println("Error, please, try again.");
            return inputFloat(text);
        }
    }

    private static String inputString(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        if (input.hasNextLine()) {
            return input.nextLine();
        } else {
            System.out.println("Error, please, try again.");
            return inputString(text);
        }
    }

    private static float[] extendArrayFloat(float[] array) {
        float[] temp = array.clone();
        array = new float[array.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        return array;
    }

    private static String[] extendArrayStr(String[] array) {
        String[] temp = array.clone();
        array = new String[array.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        return array;
    }

    private static float operate(float num1, float num2, String oper) {
        switch (oper) {
            case ("+"):
                return num1 + num2;
            case ("-"):
                return num1 - num2;
            case ("*"):
                return num1 * num2;
            case ("/"):
                return num1 / num2;
            default:
                return num1;
        }
//        if (oper.equals("+")){
//            return num1 + num2;
//        }
//        if (oper.equals("-")){
//            return num1 - num2;
//        }
//        if (oper.equals("*")){
//            return num1 * num2;
//        }
//        if (oper.equals("/")){
//            return num1 / num2;
//        }
//        else{
//            return num1;
//        }
    }

}
