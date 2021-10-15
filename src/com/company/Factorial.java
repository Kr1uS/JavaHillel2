package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = input.nextInt();

        System.out.println(n + "! = " + factorial(n));
    }

    public static int factorial(int n){
        if (n == 1){
            return n;
        }else{
            return n*factorial(n-1);
        }
    }
}
