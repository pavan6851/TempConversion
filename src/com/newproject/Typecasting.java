package com.newproject;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //"a" the reference variable is of the type int but it is converting into float by narrowing the conversion
        Scanner input = new Scanner(System.in);
        int a = (int)(67.56f);
        System.out.println(a);

        int b = 257; // as the size of byte is just 256 and the int type is 257 it basically will calculate the remainder 257%256=1
        byte c = (byte)(b);
        System.out.println(c);
    }
}
