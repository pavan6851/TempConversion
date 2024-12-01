package com.newproject;

import java.util.Scanner;

public class Sumprogram {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter the value of a and b: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
        System.out.println();

    }
}
