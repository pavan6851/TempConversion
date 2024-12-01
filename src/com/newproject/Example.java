package com.newproject;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the roll number : ");
//        int rollno = input.nextInt();
//        System.out.println("My roll number is " + rollno);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        //String name = input.next();//only first string will be printed
        String name1 = input.nextLine();//full string will be printed
        System.out.println("My name is " + name1);
    }
}
