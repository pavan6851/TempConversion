package com.newproject;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the temperature: ");
//
//        float tempC = input.nextFloat();
//
//        float tempF = ( tempC * 9/5 ) +32;
//
//        System.out.print("Temp in Fahrenheit is " + tempF);

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature : ");

        float tempF = input.nextFloat();

        float tempC = ((tempF - 32)*5)/9;

        System.out.println("Temp in Celsius is " + tempC);

    }
}
